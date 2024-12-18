//  Funciones pertenecientes a document.html
window.addEventListener("load",()=>{
    const input = document.getElementById("file");
    const filewrapper = document.getElementById("layout__uploadDocuments");

    input.addEventListener("change",(e)=>{
        let fileName = e.target.files[0].name;
        let filetype = e.target.value.split(".").pop();
        fileshow(fileName, filetype);
    })

    const fileshow = ( fileName, filetype) => {
        const showfileboxElem = document.createElement("div");
        showfileboxElem.classList.add("uploadDocuments__showfilebox");

        const leftElem = document.createElement("div");
        leftElem.classList.add("uploadDocuments__left");

        const fileTypeElem = document.createElement("span");
        fileTypeElem.classList.add("filetype");
        fileTypeElem.innerHTML = filetype;
        leftElem.append(fileTypeElem);

        const filetitleElem = document.createElement("h3");
        filetitleElem.innerHTML = fileName;
        leftElem.append(filetitleElem);
        showfileboxElem.append(leftElem);

        const rightElem = document.createElement("div");
        rightElem.classList.add("uploadDocuments__right");
        rightElem.innerHTML = '<i class="uploadDocuments__icon fa-solid fa-x"></i>';
        showfileboxElem.append(rightElem);

        filewrapper.append(showfileboxElem);

        rightElem.addEventListener("click", ()=>
        {
            filewrapper.removeChild(showfileboxElem);
        })
    }

})


// Funciones pertenecientes a user-management.
document.addEventListener("DOMContentLoaded", () => {
    // Seleccionamos el contenedor de la tabla para delegar los eventos
    const tableBody = document.querySelector(".user-management__table tbody");

    // Delegamos el evento 'click' a los iconos con la clase 'user-management__icon'
    tableBody.addEventListener("click", (event) => {
        // Verificamos si el clic ocurrió en un elemento con la clase 'user-management__icon'
        if (event.target.classList.contains("user-management__icon")) {
            // Obtenemos el elemento <tr> más cercano al icono clicado
            const row = event.target.closest("tr");

            // Eliminamos la fila
            if (row) {
                row.remove();
            }
        }
    });
});

