#!/bin/bash

#refresh repos
sudo apt-get update

#add opentracker to repo & refresh
sudo apt-get -y install python-software-properties
sudo add-apt-repository -y ppa:mystic-mirage/opentracker
sudo apt-get update

#install mktorrent, opentracker, sshpass, tmux
sudo apt-get -y install mktorrent
sudo apt-get -y install opentracker opentracker-ipv6
sudo apt-get -y install sshpass
sudo apt-get -y install tmux

#install apache
sudo apt-get -y install apache2 libapache2-mod-scgi

#checkout&compile xmlrpc-c (rtorrent dependency), first install deps
sudo apt-get -y install gcc g++ libncurses?-dev libsigc++-2.0-dev libssl-dev subversion make libcurl4-nss-dev
#then co#compile
mkdir ~/tmp
cd ~/tmp
svn checkout http://svn.code.sf.net/p/xmlrpc-c/code/advanced xmlrpc-c
cd xmlrpc-c
./configure
make
sudo make install
rm -rf xmlrpc-c

#enable xmlrpc in apache
sudo sh -c 'echo "LoadModule scgi_module /usr/lib/apache2/modules/mod_scgi.so" >> /etc/apache2/apache2.conf'
sudo sh -c 'echo "SCGIMount /RPC2 127.0.0.1:5000" >> /etc/apache2/apache2.conf'

sudo service apache2 restart

#get and compile libtorrent (rtorrent dependency)
cd ~/tmp
wget http://rtorrent.net/downloads/libtorrent-0.13.6.tar.gz
tar -xvzf libtorrent-0.13.6.tar.gz
cd libtorrent-0.13.6
./configure
make
sudo make install
cd ..
rm -rf libtorrent-0.13.6

#get and compile rtorrent with xmlrpc enabled
cd ~/tmp
wget http://rtorrent.net/downloads/rtorrent-0.9.6.tar.gz
tar -xvzf rtorrent-0.9.6.tar.gz
cd rtorrent-0.9.6
./configure --with-xmlrpc-c=/usr/local/bin/xmlrpc-c-config
make
sudo make install
cd ..
rm -rf rtorrent-0.9.6

#update library paths so rtorrent can see libtorrent
sudo sh -c 'echo "include /usr/local/lib" >> /etc/ld.so.conf'
sudo ldconfig

#create dirs
mkdir ~/Torrents
mkdir ~/session
mkdir ~/Downloads

#get rtorrent and opentracker config files
cp -u ~/shared/rtorrent.rc ~/.rtorrent.rc
cp -u ~/shared/opentracker.conf ~/.opentracker.conf