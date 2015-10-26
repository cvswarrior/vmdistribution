package hu.bme.mit.vmdistribution.app;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

import hu.bme.mit.vmdistribution.app.resources.Properties;
import hu.bme.mit.vmdistribution.app.ssh.Host;
import hu.bme.mit.vmdistribution.app.ssh.SSHUtil;
import hu.bme.mit.vmdistribution.model.Computer;
import hu.bme.mit.vmdistribution.model.ComputerConfig;
import hu.bme.mit.vmdistribution.model.CustomVM;
import hu.bme.mit.vmdistribution.model.Lab;
import hu.bme.mit.vmdistribution.model.Vagrant_VM;
import hu.bme.mit.vmdistribution.model.VirtualMachine;

public class UseModel {
       
        private static final Logger logger_parent = Logger.getLogger("");
        private static final Logger logger = Logger.getLogger(UseModel.class.getName());

        public static void init(){
                System.setProperty("java.util.logging.SimpleFormatter.format", "%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS %4$s %2$s %5$s%6$s%n");
                logger_parent.setLevel(Level.INFO);
        }
       
        public static void main(String[] args) {
                init();
                logger.log(Level.INFO, "[Starting tasks.]");
                //EMFModelLoad loader = new EMFModelLoad();
                //LabSystem myLabSystem = loader.load();
                //System.out.println(ModelValidator.validateModel(myLabSystem));
                //File copy_test = new File("../hu.bme.mit.vmdistribution.model.tests/modeltest/My.vmdistribution");
                //copyVM("lxvcmsd1.develop.raiffeisen.hu", "b1vincze", "123qwe", copy_test);
                tryExec("labpc101", "/home/b1vincze/test.sh");
                logger.log(Level.INFO, "[Done.]");
        }
       
       
        public static void copyVM(String pcname, File vm){
                Host host = Properties.getHostData(pcname);
                SSHUtil sshutil = new SSHUtil(host);
                sshutil.connect();
                List<File> files = new ArrayList<>();
                files.add(vm);
                sshutil.copyFiles(files, "/home/b1vincze");
                sshutil.disconnect();
        }
       
        public static void distribute(Lab goal){
               
                Set<VirtualMachine> seenVMs = new HashSet<>();
                Map<String, String> torrentfilemap = new HashMap<>();
               
                //prepare vagrant vms & copy single copy of vms to torrent seed
                for (ComputerConfig cfgitem : goal.getComputerconfig()){
                        Computer pc = cfgitem.getComputer();
                       
                        for(VirtualMachine vm : pc.getVirtualmachines()){
                               
                                if(seenVMs.contains(vm)){
                                        continue;
                                }
                               
                                if("CustomVM".equals(vm.eClass().toString())){
                                        CustomVM cutomvm = (CustomVM) vm;
                                        copyVM("seed", cutomvm.getVmZipArchive());
                                }else{
                                        Vagrant_VM vagrantvm = (Vagrant_VM) vm;
                                        prepareVagrantVM(vagrantvm);
                                        copyVM("seed", vagrantvm.getDistributionImage());
                                }
                                seenVMs.add(vm);
                               
                        }
                }
               
                for (VirtualMachine vm : seenVMs){
                        //tryExec("seed", "createtorrentfiles");
                        torrentfilemap.put(vm.getName(), "");//necessary?
                }
               
                for(ComputerConfig cfgitem: goal.getComputerconfig()){
                        Computer pc = cfgitem.getComputer();
                        pc.eClass();
                       
                }
               
                //updatemodel
        }
       
        public static void prepareVagrantVM(Vagrant_VM vm){
                //TODO
                vm.setDistributionImage(null);
                vm.setReadyToDistribute(true);
        }
       
        public static void tryExec(String pcname, String command){
                SSHUtil sshutil = new SSHUtil(Properties.getHostData(pcname));
                sshutil.connect();
                sshutil.executeCommand(command);
                sshutil.disconnect();
        }
       
} 