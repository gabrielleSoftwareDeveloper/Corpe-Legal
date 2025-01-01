// Función para abrir el modal
function openModal(modal) {

    if(modal === 1){
        document.querySelector(".cases__form").style.display = "block";
    }else if(modal === 2){
        document.querySelector(".clientfile__form").style.display = "block";
    } else if(modal === 3){
        document.querySelector(".notes__form").style.display = "block";
    } else{
        document.querySelector(".accounting__form").style.display = "block";
    }
    
}

// Función para cerrar el modal
function closeModal(modal) {
    if(modal === 1){
        document.querySelector(".cases__form").style.display = "none";
    }else if(modal === 2){
        document.querySelector(".clientfile__form").style.display = "none";
    } else if(modal === 3){
        document.querySelector(".notes__form").style.display = "none";
    } else{
        document.querySelector(".accounting__form").style.display = "none";
    }

}
