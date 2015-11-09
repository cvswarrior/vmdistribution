#!/bin/bash

#param1 hostname
#param2 host pass
#param3 torrentfile name

sshpass -p "$2" scp /home/vagrant/Torrents/$3 vagrant@$1:/home/vagrant/Torrents/
echo "Copied $3 to $1:/home/vagrant/Torrents/"