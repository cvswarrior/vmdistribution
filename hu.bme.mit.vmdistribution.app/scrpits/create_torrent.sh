#!/bin/bash

#param1: seed ip/host
#param2: seeded item name
#param3: torrentfile name

rm ~/Torrents/$3
mktorrent -a http://$1:6969/announce/ -o ~/Torrents/$3 ~/Downloads/$2 
echo "$3 created."