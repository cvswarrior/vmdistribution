#!/bin/bash

#param1: torrentfile name
#param2: seeded item name
#param3: seed ip/host

~/opentracker/opentracker -f ~/.opentracker.conf &
echo "Opentracker started."

rm ~/Torrents/$3
mktorrent -a http://$1:6969/announce/ -o ~/Torrents/$3 ~/Downloads/$2 
echo ".torrent created."

tmux new-session -s '/usr/bin/rtorrent -d /home/vagrant/Downloads' -d rtorrent
echo "rtorrent started in tmux session named 'rtorrent'"
echo "Seeding started."