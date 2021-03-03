CREATE TABLE auditoria
(
    id               BIGINT(20)  NOT NULL AUTO_INCREMENT,
    ip_origin        VARCHAR(20) NOT NULL,
    date_request     DATETIME    NOT NULL,
    method_execution VARCHAR(50) NOT NULL,
    PRIMARY KEY auditoria_pk (id)
);