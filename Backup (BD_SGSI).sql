--
-- PostgreSQL database dump
--

-- Dumped from database version 9.4.24
-- Dumped by pg_dump version 9.4.24
-- Started on 2020-04-10 21:24:30

SET statement_timeout = 0;
SET lock_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;

--
-- TOC entry 1 (class 3079 OID 11855)
-- Name: plpgsql; Type: EXTENSION; Schema: -; Owner: 
--

CREATE EXTENSION IF NOT EXISTS plpgsql WITH SCHEMA pg_catalog;


--
-- TOC entry 2050 (class 0 OID 0)
-- Dependencies: 1
-- Name: EXTENSION plpgsql; Type: COMMENT; Schema: -; Owner: 
--

COMMENT ON EXTENSION plpgsql IS 'PL/pgSQL procedural language';


SET default_tablespace = '';

SET default_with_oids = false;

--
-- TOC entry 176 (class 1259 OID 16503)
-- Name: estadoA; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE public."estadoA" (
    "id_estadoA" numeric(2,0) NOT NULL,
    descripcion character varying(500) NOT NULL
);


ALTER TABLE public."estadoA" OWNER TO postgres;

--
-- TOC entry 177 (class 1259 OID 16511)
-- Name: estadoB; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE public."estadoB" (
    "id_estadoB" numeric(2,0) NOT NULL,
    "descripción" character varying(500) NOT NULL
);


ALTER TABLE public."estadoB" OWNER TO postgres;

--
-- TOC entry 178 (class 1259 OID 16519)
-- Name: estadoM; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE public."estadoM" (
    "id_estadoM" numeric(2,0) NOT NULL,
    descripcion character varying(500) NOT NULL
);


ALTER TABLE public."estadoM" OWNER TO postgres;

--
-- TOC entry 174 (class 1259 OID 16464)
-- Name: grupos; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE public.grupos (
    id_grupo numeric(2,0) NOT NULL,
    nombre character varying(40) NOT NULL
);


ALTER TABLE public.grupos OWNER TO postgres;

--
-- TOC entry 173 (class 1259 OID 16439)
-- Name: item; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE public.item (
    id_item numeric(2,0) NOT NULL,
    nombre character varying NOT NULL,
    "FK_id_grupo" numeric(1,0) NOT NULL
);


ALTER TABLE public.item OWNER TO postgres;

--
-- TOC entry 175 (class 1259 OID 16498)
-- Name: respuestas; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE public.respuestas (
    id_respuesta numeric(3,0) NOT NULL,
    "FK_id_grupo" numeric(2,0) NOT NULL,
    "FK_id_item" numeric(2,0) NOT NULL,
    "FK_id_estadoA" numeric(2,0) NOT NULL,
    "FK_id_estadoM" numeric(2,0) NOT NULL,
    "FK_id_estadoB" numeric(2,0) NOT NULL
);


ALTER TABLE public.respuestas OWNER TO postgres;

--
-- TOC entry 2039 (class 0 OID 16503)
-- Dependencies: 176
-- Data for Name: estadoA; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public."estadoA" ("id_estadoA", descripcion) FROM stdin;
\.


--
-- TOC entry 2040 (class 0 OID 16511)
-- Dependencies: 177
-- Data for Name: estadoB; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public."estadoB" ("id_estadoB", "descripción") FROM stdin;
\.


--
-- TOC entry 2041 (class 0 OID 16519)
-- Dependencies: 178
-- Data for Name: estadoM; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public."estadoM" ("id_estadoM", descripcion) FROM stdin;
\.


--
-- TOC entry 2037 (class 0 OID 16464)
-- Dependencies: 174
-- Data for Name: grupos; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.grupos (id_grupo, nombre) FROM stdin;
1	Activos esenciales
2	Arquitectura del sistema
3	Datos/Información
4	Aplicaciones (software)
5	Equipos informáticos (hardware)
6	Redes de comunicaciones
7	Soportes de información
8	Personal
\.


--
-- TOC entry 2036 (class 0 OID 16439)
-- Dependencies: 173
-- Data for Name: item; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.item (id_item, nombre, "FK_id_grupo") FROM stdin;
1	[adm] datos de interés para la administración pública	1
2	[vr] Datos vitales (registros de la organización)	1
3	[A] Nivel alto	1
4	[M] Nivel medio	1
5	[B] Nivel bajo	1
6	[R] Difusión limitada	1
7	[UC] sin clasificar	1
8	[pub] De caracter privado	1
9	[sap] Punto de acceso al servicio 	2
10	[ip] Punto de interconexión	2
11	[ext]  Proporcionado por terceros	2
12	[files] Ficheros	3
13	[backup] Copias de respaldo	3
14	[conf]  Datos de configuración	3
15	[int] Datos de gestión interna	3
16	[password] Credenciales/Contraseñas	3
17	[auth] Datos de validación de credenciales	3
18	[acl] Datos de control de acceso	3
19	[log] Registro de actividad	3
20	[source]Código fuente	3
21	[exe] Código ejecutable	3
22	[test] Datos de prueba	3
23	[modem] Módems	4
24	[hub] Concentradores	4
25	[switch] Conmutadores	4
26	[router] Encaminadores	4
27	[wap] Punto de acceso inalámbrico	4
28	[ue] Usuarios externos	5
29	[ui] Usuarios internos	5
30	[op] Operadores	5
31	[adm] Administradores de sistemas	5
32	[dba] Administradores de bases de datos	5
33	[sec] Administradores de seguridad	5
34	[des] Desarrolladores/Programadores	5
35	[prov] Proveedores	5
36	[PSNT] Red telefónica	6
37	[radio] Comunicaciones radio	6
38	[wifi] Red inalámbrica	6
39	[mobile] Telefonía Móvil	6
40	[LAN] Red local	6
41	[MAN] Red metropolitana	6
42	[Internet] Internet	6
43	[prp] Desarrollo propio (In house)	7
44	[www] Servidor de presentación	7
45	[app] Servidor de aplicaciones	7
46	[email_client] Cliente de correo electrónico	7
47	[email_server] Servidor de correo electrónico	7
48	[file] Servidor de ficheros	7
49	[dbms] Sistema de gestión de bases de datos	7
50	[office] Ofimática	7
51	[av] Antivirus	7
52	[os] Sistema operativo	7
53	[backup] Sistema de backup	7
54	[disk] Discos	8
55	[san] Almacenamiento en red	8
56	[cd] Cederrón (CD-ROM)	8
57	[usb] Memorias USB	8
58	[dvd] DVD	8
59	[mc] Tarjetas de memoria	8
60	[printed] Material impreso	8
\.


--
-- TOC entry 2038 (class 0 OID 16498)
-- Dependencies: 175
-- Data for Name: respuestas; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.respuestas (id_respuesta, "FK_id_grupo", "FK_id_item", "FK_id_estadoA", "FK_id_estadoM", "FK_id_estadoB") FROM stdin;
\.


--
-- TOC entry 1916 (class 2606 OID 16510)
-- Name: estadoA_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY public."estadoA"
    ADD CONSTRAINT "estadoA_pkey" PRIMARY KEY ("id_estadoA");


--
-- TOC entry 1918 (class 2606 OID 16518)
-- Name: estadoB_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY public."estadoB"
    ADD CONSTRAINT "estadoB_pkey" PRIMARY KEY ("id_estadoB");


--
-- TOC entry 1920 (class 2606 OID 16526)
-- Name: estadoM_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY public."estadoM"
    ADD CONSTRAINT "estadoM_pkey" PRIMARY KEY ("id_estadoM");


--
-- TOC entry 1907 (class 2606 OID 16480)
-- Name: grupos_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY public.grupos
    ADD CONSTRAINT grupos_pkey PRIMARY KEY (id_grupo);


--
-- TOC entry 1905 (class 2606 OID 16487)
-- Name: item_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY public.item
    ADD CONSTRAINT item_pkey PRIMARY KEY (id_item);


--
-- TOC entry 1914 (class 2606 OID 16502)
-- Name: respuestas_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY public.respuestas
    ADD CONSTRAINT respuestas_pkey PRIMARY KEY (id_respuesta);


--
-- TOC entry 1908 (class 1259 OID 16544)
-- Name: FKI_id_estadoA; Type: INDEX; Schema: public; Owner: postgres; Tablespace: 
--

CREATE INDEX "FKI_id_estadoA" ON public.respuestas USING btree ("FK_id_estadoA");


--
-- TOC entry 1909 (class 1259 OID 16556)
-- Name: FKI_id_estadoB; Type: INDEX; Schema: public; Owner: postgres; Tablespace: 
--

CREATE INDEX "FKI_id_estadoB" ON public.respuestas USING btree ("FK_id_estadoB");


--
-- TOC entry 1910 (class 1259 OID 16550)
-- Name: FKI_id_estadoM; Type: INDEX; Schema: public; Owner: postgres; Tablespace: 
--

CREATE INDEX "FKI_id_estadoM" ON public.respuestas USING btree ("FK_id_estadoM");


--
-- TOC entry 1911 (class 1259 OID 16532)
-- Name: FKI_id_grupo; Type: INDEX; Schema: public; Owner: postgres; Tablespace: 
--

CREATE INDEX "FKI_id_grupo" ON public.respuestas USING btree ("FK_id_grupo");


--
-- TOC entry 1903 (class 1259 OID 16458)
-- Name: fki_FK_id_grupo; Type: INDEX; Schema: public; Owner: postgres; Tablespace: 
--

CREATE INDEX "fki_FK_id_grupo" ON public.item USING btree ("FK_id_grupo");


--
-- TOC entry 1912 (class 1259 OID 16538)
-- Name: fki_KF_id_item; Type: INDEX; Schema: public; Owner: postgres; Tablespace: 
--

CREATE INDEX "fki_KF_id_item" ON public.respuestas USING btree ("FK_id_item");


--
-- TOC entry 1924 (class 2606 OID 16539)
-- Name: FK_id_estadoA; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.respuestas
    ADD CONSTRAINT "FK_id_estadoA" FOREIGN KEY ("FK_id_estadoA") REFERENCES public."estadoA"("id_estadoA");


--
-- TOC entry 1926 (class 2606 OID 16551)
-- Name: FK_id_estadoB; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.respuestas
    ADD CONSTRAINT "FK_id_estadoB" FOREIGN KEY ("FK_id_estadoB") REFERENCES public."estadoB"("id_estadoB");


--
-- TOC entry 1925 (class 2606 OID 16545)
-- Name: FK_id_estadoM; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.respuestas
    ADD CONSTRAINT "FK_id_estadoM" FOREIGN KEY ("FK_id_estadoM") REFERENCES public."estadoM"("id_estadoM");


--
-- TOC entry 1922 (class 2606 OID 16527)
-- Name: FK_id_grupo; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.respuestas
    ADD CONSTRAINT "FK_id_grupo" FOREIGN KEY ("FK_id_grupo") REFERENCES public.grupos(id_grupo);


--
-- TOC entry 1921 (class 2606 OID 16493)
-- Name: Fk_id_grupo; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.item
    ADD CONSTRAINT "Fk_id_grupo" FOREIGN KEY ("FK_id_grupo") REFERENCES public.grupos(id_grupo);


--
-- TOC entry 1923 (class 2606 OID 16533)
-- Name: KF_id_item; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.respuestas
    ADD CONSTRAINT "KF_id_item" FOREIGN KEY ("FK_id_item") REFERENCES public.item(id_item);


--
-- TOC entry 2049 (class 0 OID 0)
-- Dependencies: 6
-- Name: SCHEMA public; Type: ACL; Schema: -; Owner: postgres
--

REVOKE ALL ON SCHEMA public FROM PUBLIC;
REVOKE ALL ON SCHEMA public FROM postgres;
GRANT ALL ON SCHEMA public TO postgres;
GRANT ALL ON SCHEMA public TO PUBLIC;


-- Completed on 2020-04-10 21:24:31

--
-- PostgreSQL database dump complete
--

