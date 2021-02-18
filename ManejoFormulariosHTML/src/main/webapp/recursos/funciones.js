function validarForm(form){
    
    var usuario=form.usuario;
    if(usuario.value === "" || usuario.value==="Escribir usuario"){
        alert("Proporcionar un nombre para el usuario.");
        usuario.focus();
        usuario.select();
        return false;
    }
    
    var password=form.password;
    if(password.value === "" || password.value.length<3){
        alert("Proporcionar un password de al menos 3 carecters para el usuario.");
        password.focus();
        password.select();
        return false;
    }
    
    var tecnologias=form.tecnologia;
    var checkSeleccionado=false;
    for(var i=0;i<tecnologias.length;i++){
        if(tecnologias[i].checked){
            checkSeleccionado=true;
        }
    }
    if(!checkSeleccionado){
        alert("Debe seleccionar una tecnologia");
        return false;
    }
    
    var generos=form.genero;
    var radioSeleccionado=false;
    for(var i=0;i<generos.length;i++){
        if(generos[i].checked){
            radioSeleccionado=true;
        }
    }
     if(!radioSeleccionado){
        alert("Debe seleccionar un genero.");
        return false;
    }
    
    var ocupacion =form.ocupacion;
    if(ocupacion.value===""){
        alert("Debe seleccionar una ocupacion.");
        return false;
    }
    
    alert("Formulario valido, enviendo datos al servidor...");
    return true;
    
}