#!/bin/bash

echo "Unpacking opentracker.tar.gz..."
tar -xvzf ~/shared/opentracker.tar.gz > /dev/null 2>&1
echo "Unpacking libowfat.tar.gz..."
tar -xvzf ~/shared/libowfat.tar.gz > /dev/null 2>&1

mkdir ~/Torrents
mkdir ~/session
mkdir ~/Downloads

cp -u ~/shared/rtorrent.rc ~/.rtorrent.rc
cp -u ~/shared/opentracker.conf ~/.opentracker.conf

sudo apt-get -y install rtorrent
sudo apt-get -y install mktorrent
sudo apt-get -y install sshpass
sudo apt-get -y install tmux

sudo apt-get -y install make
echo "Building dependency: libowfat"
cd ~/libowfat
sudo make > ~/shared/libowfat_make.log 2>&1
echo "Building Opentracker..."
cd ~/opentracker
sudo make > ~/shared/opentracker_make.log 2>&1
