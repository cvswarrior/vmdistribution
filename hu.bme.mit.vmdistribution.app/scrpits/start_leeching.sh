#!/bin/bash

#param1 hostname
#param2 host pass
#param3 torrentfile name

sshpass -p "$2" ssh vagrant@$1 "tmux new-session -d -s 'rtorrent' 'rtorrent'"
echo "rtorrent started on $1" 