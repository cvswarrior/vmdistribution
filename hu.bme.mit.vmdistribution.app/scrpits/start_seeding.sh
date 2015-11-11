#!/bin/bash

#tmux new-session -s '~/opentracker/opentracker -f ~/.opentracker.conf' -d opentracker
~/opentracker/opentracker -f ~/.opentracker.conf > /dev/null &
#echo "Opentracker started in tmux session named 'opentracker'"

tmux new-session -s '/usr/bin/rtorrent -d ~/Downloads' -d rtorrent
echo "rtorrent started in tmux session named 'rtorrent'"
echo "Seeding started."