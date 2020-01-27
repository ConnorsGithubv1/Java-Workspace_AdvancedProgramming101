
@echo off
title git push
echo add -A, git commit -m, push -u origin master
git add -A
echo type in name
set /p name=
git commit -m "%name%"
git push -u origin master
pause