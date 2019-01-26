#!/bin/bash

while :; do
	java -server -Xmn512m -Xms4096m -Xmx4096m -Xnoclassgc -XX:+AggressiveOpts -XX:TargetSurvivorRatio=90 -XX:SurvivorRatio=16 -XX:MaxTenuringThreshold=12 -XX:+UseParNewGC -XX:+UseConcMarkSweepGC -XX:+CMSIncrementalMode -XX:+CMSIncrementalPacing -XX:+CMSParallelRemarkEnabled -XX:UseSSE=3 -XX:+UseFastAccessorMethods -Dfile.encoding=UTF-8 -cp config:./../libs/* l2f.gameserver.GameServer > log/stdout.log 2>&1
	[ $? -ne 2 ] && break
	sleep 10
done
