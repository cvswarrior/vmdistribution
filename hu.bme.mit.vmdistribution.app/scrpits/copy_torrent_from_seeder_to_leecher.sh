#!/bin/bash

#param1 hostname
#param2 ssh user
#param3 ssh pass
#param4 torrentfile name

sshpass -p "$3" scp -o StrictHostKeyChecking=no ~/Torrents/$4 $2@$1:~/Torrents
echo "Copied $4 to $1:~/Torrents"