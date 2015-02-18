alter table Asentamiento drop constraint FK_g2bdvcemkecn7ecv3uii7i2ym if exists
alter table Asentamiento drop constraint FK_6aknuhg6gk8vdug8m2cujon1e if exists
alter table CodigoPostal drop constraint FK_qkcu41fplmsxc1krljxw9jka2 if exists
alter table Municipio drop constraint FK_fyv1472fwhb39ylym1qj0a23h if exists
alter table Municipio drop constraint FK_23bxkcy0r5l5b3g2jg93kw6x1 if exists
drop table Asentamiento if exists
drop table CodigoPostal if exists
drop table EntidadFederativa if exists
drop table Municipio if exists
drop table Plaza if exists
drop table TipoAsentamiento if exists
drop table TipoEstablecimiento if exists
