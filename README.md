📤 Cargue de un proyecto de NetBeans a GitHub (paso a paso)

Esta sección documenta cómo subir el proyecto AeroGestión Prada, desarrollado en NetBeans, a un repositorio de GitHub.

Paso 1. Abrir el proyecto en NetBeans

Abrir NetBeans y verificar que el proyecto AeroGestionPrada aparece en la ventana Projects y compila sin errores (clic derecho > Clean and Build).

Paso 2. Crear el repositorio vacío en GitHub
Ingresar a github.com e iniciar sesión.
Clic en New (o + > New repository).
Completar:
Repository name: AeroGestionPrada
Visibilidad: Public o Private.
⚠️ No marcar Add a README, .gitignore ni license.
Clic en Create repository.
Copiar la URL del repositorio: https://github.com/TU_USUARIO/AeroGestionPrada.git
Paso 3. Generar el token de acceso personal (PAT)

GitHub no acepta la contraseña de la cuenta desde NetBeans; se usa un token.

GitHub > foto de perfil > Settings.
Developer settings > Personal access tokens > Tokens (classic).
Generate new token (classic).
Note: NetBeans AeroGestionPrada · Expiration: 90 días · Scope: ✅ repo.
Generate token y copiarlo de inmediato (solo se muestra una vez).
Paso 4. Inicializar Git en el proyecto
Clic derecho sobre el proyecto.
Versioning > Initialize Git Repository…
Confirmar la ruta y presionar OK.

Los archivos aparecerán en color verde (nuevos).

Paso 5. Crear el archivo .gitignore

En la raíz del proyecto crear .gitignore con:

gitignore
/build/
/dist/
/target/
*.class
/nbproject/private/
/nbbuild/
/nbdist/
nbactions.xml
*.log
Thumbs.db
.DS_Store
Paso 6. Hacer el commit inicial
Clic derecho sobre el proyecto > Git > Commit…
Mensaje: Primer commit: estructura inicial de AeroGestión Prada
Revisar la lista de archivos y presionar Commit.
Paso 7. Subir el proyecto a GitHub (Push)
Clic derecho sobre el proyecto > Git > Remote > Push…
Seleccionar Specify Git Repository Location.
Completar:
Repository URL: https://github.com/TU_USUARIO/AeroGestionPrada.git
User: tu usuario de GitHub.
Password: el token (PAT).
Marcar Save Password (opcional) y presionar Next.
En Select Local Branches, marcar la rama master (o main) y presionar Next.
Confirmar la rama remota de destino y presionar Finish.
Revisar la pestaña Output de NetBeans para confirmar que el push fue exitoso.
Paso 8. Verificar el cargue en GitHub
Abrir el repositorio en GitHub y refrescar (F5).
Confirmar que aparecen src/, nbproject/, build.xml y demás archivos.
Confirmar que el commit se ve en el historial.
Alternativa por terminal

Si se prefiere usar comandos desde la carpeta del proyecto:

bash
git init
git add .
git commit -m "Primer commit: estructura inicial de AeroGestión Prada"
git branch -M main
git remote add origin https://github.com/TU_USUARIO/AeroGestionPrada.git
git push -u origin main

Cuando pida credenciales, usar el usuario de GitHub y el token como contraseña.

Actualizar cambios posteriores
Acción	NetBeans	Terminal
Confirmar cambios	Clic derecho > Git > Commit…	git add . y git commit -m "mensaje"
Subir cambios	Git > Remote > Push…	git push
Traer cambios	Git > Remote > Pull…	git pull
Errores frecuentes
Error	Causa	Solución
Authentication failed	Se usó la contraseña en vez del token	Usar el PAT como contraseña
Permission denied	Token sin permiso repo	Regenerar el token con el scope repo
Updates were rejected	El remoto tiene cambios que no están en local	Hacer Pull y luego Push
failed to push some refs	Nombre de rama distinto (master vs main)	git branch -M main y volver a hacer push
Se suben build/ o dist/	Falta el .gitignore	Crearlo y ejecutar git rm -r --cached build dist
