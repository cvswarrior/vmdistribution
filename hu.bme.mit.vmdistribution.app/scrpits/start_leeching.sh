#!/bin/bash

#param1 hostname
#param2 ssh user
#param3 ssh pass

sshpass -p "$3" ssh -o StrictHostKeyChecking=no $2@$1 "tmux new-session -d -s 'rtorrent' 'rtorrent'"
echo "rtorrent started on $1" 