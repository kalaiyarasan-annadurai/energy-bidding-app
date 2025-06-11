#!/bin/bash
pkill -f 'java -jar' || true
nohup java -jar /home/ec2-user/app/energybidding-0.0.1-SNAPSHOT.jar > /home/ec2-user/app/output.log 2>&1 &
