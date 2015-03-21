@echo off

echo Running demo using Queues
"%JAVA_HOME%\bin\java" -Djava.security.manager -Djava.security.policy="myjms.policy" MessageProducer




