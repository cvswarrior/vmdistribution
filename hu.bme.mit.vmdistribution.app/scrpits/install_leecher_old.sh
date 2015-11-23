#!/bin/bash

mkdir ~/Downloads
mkdir ~/Torrents
mkdir ~/session
cp -u  ~/shared/rtorrent.rc ~/.rtorrent.rc
sudo apt-get -y install rtorrent
sudo apt-get -y install tmux