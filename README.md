# TM-IS2-Petrolera
Trabajo de maquina de la materia Ingenieria de Software 2. El proyecto es crear un Software para la empresa TSB S.A, el cual administre el stock, cantidad de producto vendido, entrada y salida de camiones y operarios para la extraccion de producto, entre otras acciones.

# Sistema de Gestión para Petrolera TSB S.A.

## 📝 Descripción del Proyecto
Este documento describe los requisitos para un sistema de gestión integral destinado a la Petrolera TSB S.A. El objetivo principal es digitalizar y centralizar la información sobre la **maquinaria, el personal, los clientes (Companys) y las operaciones** en yacimientos.

## 🎯 Objetivo Principal
El cliente desea un sistema que permita computarizar toda la información relacionada con la empresa, incluyendo activos como maquinaria y camiones, el personal, y los clientes, facilitando así una gestión más eficiente de sus operaciones de perforación, transporte y mantenimiento.

<img width="1920" height="1080" alt="Screenshot from 2025-09-14 16-26-07" src="https://github.com/user-attachments/assets/1953a4ca-423f-4e88-ad74-b130d7a84aa8" />
<img width="1600" height="900" alt="Screenshot from 2025-09-14 16-31-38" src="https://github.com/user-attachments/assets/e91516c0-ace9-4c4d-817f-874b0f7ab395" />
<img width="1600" height="900" alt="Screenshot from 2025-09-14 16-32-00" src="https://github.com/user-attachments/assets/c5661a21-3297-4ee1-bcdc-83c17dc5f829" />

## 🏗️ Requisitos Funcionales

### 1. Gestión de Yacimientos y Pozos
* **Yacimientos:** El sistema debe registrar y almacenar el nombre y la ubicación de cada yacimiento.
* **Pozos:** Se debe asociar cada pozo a un yacimiento y registrar su ubicación de perforación (equipo).

### 2. Gestión de Maquinaria
* **Datos de Maquinaria:** Se requiere almacenar el nombre y el estado de cada máquina.
* **Estados:** Los estados posibles son `funcionando`, `mantenimiento` y `fuera de servicio`.
* **Contratos:** Se debe registrar la maquinaria alquilada, la cual tiene un contrato de alquiler asociado.

### 3. Gestión de Camiones y Viajes
* **Datos de Camiones:** El sistema debe registrar el tipo de camión (`porta`, `carretón`, `chupa`), su estado (`en funcionamiento`, `reparación`, `fuera de servicio`), la mercancía que transporta, horas de funcionamiento, recorrido y el pozo asignado.
* **Propiedad:** Se debe diferenciar entre camiones **propios** y **alquilados**.
    * **Alquilados:** Se debe registrar un contrato con el nombre del propietario, fecha de inicio, fecha de caducidad y monto de alquiler.
    * **Propios:** Solo se necesita registrar su estado.
* **Viajes (Porta y Carretón):** Cada viaje debe registrar su lugar de origen, lugar de destino y fecha.
* **Asignación de Choferes:** Un chofer no está permanentemente asignado a un solo camión; la asignación depende de la disponibilidad.

---

### 4. Gestión de Empleados
* **Datos Personales:** Se debe registrar el apellido, nombre, DNI, número de interno y teléfono.
* **Estado:** Se debe indicar si el empleado está `activo` o `inactivo`.
* **Diagramas de Trabajo:** El sistema debe contemplar diferentes esquemas de trabajo:
    * `14 días por 7 días` de descanso.
    * `14 días por 14 días` de descanso.
    * `21 días por 14 días` de descanso.
* **Categoría:** Cada empleado debe tener una sola categoría: `operario`, `jefe de área`, `supervisor` o `chofer`.

---

### 5. Gestión de Clientes (Companys)
* **Datos de Clientes:** Se requiere almacenar el nombre, teléfono de contacto, ubicación, tipo de producto que se distribuye y la cantidad distribuida.
* **Viajes a Clientes:** Cada viaje realizado por un camión hacia un cliente debe registrar la fecha, lugar de origen y lugar de destino.

<img width="1071" height="845" alt="image" src="https://github.com/user-attachments/assets/3dfd6136-73f8-47b5-b3ad-10b0720d9e10" />

### Modelo de dominio
<img width="1051" height="856" alt="image" src="https://github.com/user-attachments/assets/fb734649-134c-4a7a-ad71-b0919dd497f1" />

<img width="1142" height="922" alt="image" src="https://github.com/user-attachments/assets/7fca082b-390d-4bd2-baa6-d5ac3c1ade47" />


### READ the pdf document for more info aboout this project



