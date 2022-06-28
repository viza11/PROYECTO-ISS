var validacion = true;
function registro() {
   primerNombre();
   segundoNombre();
   primerApellido();
   segundoApellido();
   correo();
   contrasenia();
   departamento();
   telefono();
   direccion();
   aceptarTerminos();
   
    if(!validacion){
        validacion = true;
        }
}
function primerNombre(){
    const regex =/^([A-Z]{1}[a-z]+)+$/;
    document.getElementById('primerNombre').style.border= '1px solid';
    if (!regex.test(document.getElementById('primerNombre').value)){
        validacion = false;
        document.getElementById('primerNombre').style.border= '1px solid red';
        document.getElementById('forma').addEventListener.submit=false;

    }
}
function segundoNombre(){
    const regex =/^([A-Z]{1}[a-z]+)+$/;
    document.getElementById('segundoNombre').style.border= '1px solid';
    if (!regex.test(document.getElementById('segundoNombre').value)){
        validacion = false;
        document.getElementById('segundoNombre').style.border= '1px solid red';

    }
}
function primerApellido(){
    const regex =/^([A-Z]{1}[a-z]+)+$/;
    document.getElementById('primerApellido').style.border= '1px solid';
    if (!regex.test(document.getElementById('primerApellido').value)){
        validacion = false;
        document.getElementById('primerApellido').style.border= '1px solid red';

    }
}
function segundoApellido(){
    const regex =/^([A-Z]{1}[a-z]+)+$/;
    document.getElementById('segundoApellido').style.border= '1px solid';
    if (!regex.test(document.getElementById('segundoApellido').value)){
        validacion = false;
        document.getElementById('segundoApellido').style.border= '1px solid red';

    }
}
function correo(){
    const regex = /^\w+([\.-]?\w+)*@(?:|hotmail|outlook|yahoo|live|gmail)\.(?:|com|es)+$/;
    document.getElementById('correo').style.border= '1px solid';
    if (!regex.test(document.getElementById('correo').value)) {
        validacion=false;
        document.getElementById('correo').style.border= '1px solid red';
    } 
}

function contrasenia(){
    const regex = /^([A-Za-z\d$@$!%*?&]{8,15})$/;
    document.getElementById('contrasenia').style.border= '1px solid';
    if (!regex.test(document.getElementById('contrasenia').value)) {
        validacion=false;
        document.getElementById('contrasenia').style.border= '1px solid red';
    } 
}

function departamento(){
    document.getElementById('departamento').style.border= '1px solid';
    if(document.getElementById('departamento').value == ' '){
        validacion=false;
        document.getElementById('departamento').style.border= '1px solid red';

    } 
}

function telefono(){
    const regex =/^[389]\d{7}$/;
    document.getElementById('telefono').style.border= '1px solid';
    if (!regex.test(document.getElementById('telefono').value)) {
        validacion=false;
        document.getElementById('telefono').style.border= '1px solid red';
    } 
}

function direccion(){
    const regex =/^[A-Za-z0-9\s]+$/;
    document.getElementById('direccion').style.border= '1px solid';
    if (!regex.test(document.getElementById('direccion').value)) {
        validacion=false;
        document.getElementById('direccion').style.border= '1px solid red';

    } 
}

function aceptarTerminos(){
    if(!document.getElementById('terminos').checked){
        validacion = false;
        alert("Debe aceptar los términos y condiciones de uso para crear una cuenta.");
    }
}


function verificar2(forma){
	
	if(validacion==false){
		return ;
	}
	
}


