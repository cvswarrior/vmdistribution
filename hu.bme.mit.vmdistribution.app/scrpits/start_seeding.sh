#!/bin/bash

tmux new-session -d -s 'opentracker' 'opentracker -f ~/.opentracker.conf'
echo "opentracker started in tmux session named 'opentracker'"
tmux new-session -d -s 'rtorrent' 'rtorrent'
echo "rtorrent started in tmux session named 'rtorrent'"
echo "Seeding started."
