--
-- PostgreSQL database dump
--

-- Dumped from database version 9.4.10
-- Dumped by pg_dump version 9.6.5

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SET check_function_bodies = false;
SET client_min_messages = warning;
SET row_security = off;

--
-- Name: plpgsql; Type: EXTENSION; Schema: -; Owner: 
--

CREATE EXTENSION IF NOT EXISTS plpgsql WITH SCHEMA pg_catalog;


--
-- Name: EXTENSION plpgsql; Type: COMMENT; Schema: -; Owner: 
--

COMMENT ON EXTENSION plpgsql IS 'PL/pgSQL procedural language';


SET search_path = public, pg_catalog;

SET default_tablespace = '';

SET default_with_oids = false;

--
-- Name: expense; Type: TABLE; Schema: public; Owner: pgmoney
--

CREATE TABLE expense (
    date character varying(500),
    amount character varying(500),
    comment character varying(500),
    typeofexpense character varying(500),
    wherebuy character varying(500)
);


ALTER TABLE expense OWNER TO pgmoney;

--
-- Name: income; Type: TABLE; Schema: public; Owner: pgmoney
--

CREATE TABLE income (
    date character varying(500),
    amount character varying(500),
    comment character varying(500),
    typeofincome character varying(500)
);


ALTER TABLE income OWNER TO pgmoney;

--
-- Data for Name: expense; Type: TABLE DATA; Schema: public; Owner: pgmoney
--

COPY expense (date, amount, comment, typeofexpense, wherebuy) FROM stdin;
1 января 2017	1000	квартплата	обязательные расходы	ЖКХ
5 февраля 2017	500	интернет	обязательные расходы	Провайдер
20 февраля 2017	1000	еда	продукты	Магнит
\.


--
-- Data for Name: income; Type: TABLE DATA; Schema: public; Owner: pgmoney
--

COPY income (date, amount, comment, typeofincome) FROM stdin;
1 марта 2017	20000	аванс	оснавная работа
20 марта 2017	40000	зарплата	оснавная работа
25 марта 2017	500000	дополнительный доход	бизнес
\.


--
-- Name: public; Type: ACL; Schema: -; Owner: postgres
--

REVOKE ALL ON SCHEMA public FROM PUBLIC;
REVOKE ALL ON SCHEMA public FROM postgres;
GRANT ALL ON SCHEMA public TO postgres;
GRANT ALL ON SCHEMA public TO PUBLIC;


--
-- PostgreSQL database dump complete
--

