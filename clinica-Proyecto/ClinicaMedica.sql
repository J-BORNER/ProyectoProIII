CREATE TABLE "usuarios" (
  "id_usuario" INT GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY,
  "nombre" varchar,
  "correo_electronico" varchar,
  "fecha_registro" DATE
);

CREATE TABLE "doctores" (
  "id_doctor" INT GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY,
  "id_usuario" int,
  "colegiado" varchar,
  "nombre_doctor" varchar,
  "especializacion_id" int,
  "fecha_registro" DATE,
  "direccion" varchar,
  "edad" int,
  "id_educacion" int,
  "id_experiencia_lab" int,
  "observacion" varchar
);

CREATE TABLE "pacientes" (
  "id_paciente" INT GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY,
  "id_usuario" int,
  "nombre_paciente" varchar,
  "direccion_paciente" varchar,
  "telefono_paciente" int,
  "id_contacto_emergencia" int,
  "fecha_registro_p" DATE,
  "fecha_nacimiento" DATE,
  "genero" varchar,
  "id_seguro" int
);

CREATE TABLE "citas" (
  "id_cita" INT GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY,
  "id_doctor" int,
  "id_paciente" int,
  "fecha_cita" DATE
);

CREATE TABLE "especializacion" (
  "id_especializacion" INT GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY,
  "nombre" varchar,
  "descripcion" varchar
);

CREATE TABLE "historial_medico" (
  "id_historial" INT GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY,
  "id_paciente" int,
  "fecha_consulta" DATE,
  "diagnostico" text
);

CREATE TABLE "prescripcion" (
  "id_prescripcion" INT GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY,
  "id_historial" int,
  "medicamento" varchar,
  "dosis" varchar,
  "duracion" varchar
);

CREATE TABLE "seguros" (
  "id_seguro" INT GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY,
  "nombre_empresa" varchar,
  "numero_poliza" varchar,
  "tipo_seguro" varchar
);

CREATE TABLE "registro_laboral" (
  "id_registrolab" INT GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY,
  "puesto" varchar,
  "institucion" varchar,
  "fecha_inicio" DATE,
  "fecha_fin" DATE
);

CREATE TABLE "contactos_emergencia" (
  "id_contacto_emergencia" INT GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY,
  "nombre" varchar,
  "telefono" varchar,
  "relacion" varchar
);

CREATE TABLE "formacion_profesional" (
  "id_formacion" INT GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY,
  "titulo" varchar,
  "institucion" varchar,
  "fecha_inicio" DATE,
  "fecha_fin" DATE
);

ALTER TABLE "doctores" ADD FOREIGN KEY ("id_usuario") REFERENCES "usuarios" ("id_usuario");

ALTER TABLE "doctores" ADD FOREIGN KEY ("especializacion_id") REFERENCES "especializacion" ("id_especializacion");

ALTER TABLE "formacion_profesional" ADD FOREIGN KEY ("id_formacion") REFERENCES "doctores" ("id_educacion");

ALTER TABLE "registro_laboral" ADD FOREIGN KEY ("id_registrolab") REFERENCES "doctores" ("id_experiencia_lab");

ALTER TABLE "pacientes" ADD FOREIGN KEY ("id_usuario") REFERENCES "usuarios" ("id_usuario");

ALTER TABLE "pacientes" ADD FOREIGN KEY ("id_contacto_emergencia") REFERENCES "contactos_emergencia" ("id_contacto_emergencia");

ALTER TABLE "pacientes" ADD FOREIGN KEY ("id_seguro") REFERENCES "seguros" ("id_seguro");

ALTER TABLE "citas" ADD FOREIGN KEY ("id_doctor") REFERENCES "doctores" ("id_doctor");

ALTER TABLE "citas" ADD FOREIGN KEY ("id_paciente") REFERENCES "pacientes" ("id_paciente");

ALTER TABLE "historial_medico" ADD FOREIGN KEY ("id_paciente") REFERENCES "pacientes" ("id_paciente");

ALTER TABLE "prescripcion" ADD FOREIGN KEY ("id_historial") REFERENCES "historial_medico" ("id_historial");
