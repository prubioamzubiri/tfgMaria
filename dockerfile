FROM tomcat:9.0.1-jre8-alpine

ADD ./target/* /usr/local/tomcat/webapps/

COPY ./datos.csv /usr/local/tomcat/webapps/datos.csv

RUN ls -l /usr/local/tomcat/webapps/

CMD ["catalina.sh", "run"]
