package hu.bme.mit.vmdistribution.app.ssh;

import hu.bme.mit.vmdistribution.app.resources.Properties;

public class Host {

        private String hostname;
        private int port;
        private String username;
        private char[] password;
       
        public Host() {
        }
       
        public Host(String hostname, int port, String username, char[] password) {
                this.hostname = hostname;
                this.port = port;
                this.username = username;
                this.password = password;
        }
       
        public Host getHostData(String hostname){
                return Properties.getHostData(hostname);
        }

        public String getHostname() {
                return hostname;
        }

        public int getPort() {
                return port;
        }

        public String getUsername() {
                return username;
        }

        public char[] getPassword() {
                return password;
        }

}
