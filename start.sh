#!/bin/bash
pkill -f 'java -jar' || true
nohup java -jar /home/ec2-user/app/energybidding.jar > /home/ec2-user/app/output.log 2>&1 &
