#!/bin/bash

tmux new-session -s '~/opentracker/opentracker -f ~/.opentracker.conf' -d opentracker
echo "Opentracker started in tmux session named 'opentracker'"

tmux new-session -s '/usr/bin/rtorrent -d ~/Downloads' -d rtorrent
echo "rtorrent started in tmux session named 'rtorrent'"
echo "Seeding started."