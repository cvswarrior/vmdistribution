#!/bin/bash

tmux new-session -s 'opentracker -f ~/.opentracker.conf' -d opentracker
echo "opentracker started in tmux session named 'opentracker'"
tmux new-session -s '/usr/bin/rtorrent' -d rtorrent
echo "rtorrent started in tmux session named 'rtorrent'"
echo "Seeding started."