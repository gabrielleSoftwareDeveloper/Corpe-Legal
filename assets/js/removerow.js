// Funciones pertenecientes a user-management.
document.addEventListener("DOMContentLoaded", () => {
    const tableBody = document.querySelector(".user-management__table tbody");
    tableBody.addEventListener("click", (event) => {
        // Verificamos si el click ocurrió en un elemento con la clase 'user-management__icon'
        if (event.target.classList.contains("user-management__icon")) {
            // Obtenemos el elemento <tr> más cercano al icono clickado
            const row = event.target.closest("tr");

            // Elimina la fila
            if (row) {
                row.remove();
            }
        }
    });
});