FROM tomcat:9.0.1-jre8-alpine

ADD ./target/* /usr/local/tomcat/webapps/

ADD ./datos.csv datos.csv

COPY ./catalina-dynamic-port.sh catalina-dynamic-port.sh

CMD ["./catalina-dynamic-port.sh", "run"]
