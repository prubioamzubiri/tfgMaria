FROM tomcat:9.0.1-jre8-alpine

ADD ./target/* /usr/local/tomcat/webapps/

COPY ./datos.csv datos.csv

ARG PORT=8080

EXPOSE $PORT

CMD ["catalina.sh","run", "-b", "0.0.0.0:$PORT"]
