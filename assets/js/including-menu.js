document.addEventListener("DOMContentLoaded", () => {
  const headerTemplateMobile = `
      <header class="menu-mobile__header">
    <div class="menu-mobile__container-logo">
        <a class="menu-mobile__link-logo" href="#">
            <img class="menu-mobile__logo" src="assets/img/logo-corpe-legal.png" alt="Logo del sitio web">
        </a>
    </div>

    <button class="menu-mobile__btn-close">
        <i class="menu-mobile__icon-close fa-solid fa-xmark"></i>
    </button>
</header>

<div class="menu-mobile__body">

    <nav class="menu-mobile__nav">
        <ul class="menu-mobile__list">
            <li class="menu-mobile__item"">
                    <a href=" login.html" class="menu-mobile__link">Inicio</a>
            </li>
            <!-- Solo disponible para el administrador -->
            <li class="menu-mobile__item"">
                    <a href=" #" class="menu-mobile__link">Administrar
                <i class="fa-solid fa-chevron-down menu-mobile__icon"></i>
                </a>
                <ul class="menu-mobile__submenu-mobile">
                    <li class="submenu-mobile__item">
                        <a href="register.html" class="submenu-mobile__link">Añadir usuario</a>
                    </li>
                    <li class="submenu-mobile__item">
                        <a href="user_management.html" class="submenu-mobile__link">Eliminar usuario</a>
                    </li>
                </ul>
            </li>
            <li class="menu-mobile__item"">
                    <a href=" #" class="menu-mobile__link">Casos
                <i class="fa-solid fa-chevron-down menu-mobile__icon"></i>
                </a>
                <ul class="menu-mobile__submenu-mobile">
                    <li class="submenu-mobile__item">
                        <a href="crm_abogado.html" class="submenu-mobile__link">CRM - Abogados</a>
                    </li>
                    <li class="submenu-mobile__item">
                        <a href="crm_admin.html" class="submenu-mobile__link">CRM - Abogados</a>
                    </li>
                    <li class="submenu-mobile__item">
                        <a href="crm_comercial.html" class="submenu-mobile__link">CRM - Comerciales</a>
                    </li>
                    <li class="submenu-mobile__item">
                        <a href="mycase.html" class="submenu-mobile__link">¿Cómo va mi caso?</a>
                    </li>
                    <li class="submenu-mobile__item">
                        <a href="#" class="submenu-mobile__link">Modificar el estado de un caso</a>
                    </li>
                    <li class="submenu-mobile__item">
                        <a href="cases.html" class="submenu-mobile__link">Cartera de casos</a>
                    </li>
                    <li class="submenu-mobile__item">
                        <a href="record_cases.html" class="submenu-mobile__link">Historial de casos</a>
                    </li>
                    <li class="submenu-mobile__item">
                        <a href="#" class="submenu-mobile__link">Estudio de viabilidad</a>
                    </li>
                    <li class="submenu-mobile__item">
                        <a href="calendar.html" class="submenu-mobile__link">Calendario</a>
                    </li>
                </ul>
            </li>
            <li class="menu-mobile__item"">
                    <a href=" #" class="menu-mobile__link">Documentación
                <i class="fa-solid fa-chevron-down menu-mobile__icon"></i>
                </a>
                <ul class="menu-mobile__submenu-mobile">
                    <li class="submenu-mobile__item">
                        <a href="documents.html" class="submenu-mobile__link">Subir documentos</a>
                    </li>
                </ul>
            </li>
            <li class="menu-mobile__item"">
                    <a href=" accounting.html" class="menu-mobile__link">Contabilidad</a>
            </li>
            <li class="menu-mobile__item"">
                    <a href=" #" class="menu-mobile__link">Enlaces externos
                <i class="fa-solid fa-chevron-down menu-mobile__icon"></i>
                </a>
                <ul class="menu-mobile__submenu-mobile">
                    <li class="submenu-mobile__item">
                        <a href="#" class="submenu-mobile__link">APUD ACTA</a>
                    </li>
                    <li class="submenu-mobile__item">
                        <a href="#" class="submenu-mobile__link">Cálculo costas procesales</a>
                    </li>
                    <li class="submenu-mobile__item">
                        <a href="#" class="submenu-mobile__link">Partido judicial</a>
                    </li>
                    <li class="submenu-mobile__item">
                        <a href="#" class="submenu-mobile__link">Firmafy</a>
                    </li>
                    <li class="submenu-mobile__item">
                        <a href="#" class="submenu-mobile__link">Legal Pigeon</a>
                    </li>
                </ul>
            </li>
            <li class="menu-mobile__item">
                    <a href=" https://www.corpelegal.com/" class="menu-mobile__link">Corpe Legal</a>
            </li>
            <li class="menu-mobile__item"">
                    <a href=" #" class="nav__title">Cerrar sesión</a>
            </li>
        </ul>
    </nav>

</div>`;

const headerTemplate = `
<!-- Navegador -->
<header class="menu__navbar">
    <!-- Logo -->
    <div class="navbar__logo">
        <a href="https://www.corpelegal.com/" class="navbar__link-logo">
            <img src="./assets/img/logo-corpe-legal.png" class="navbar__logo-light" />
        </a>
    </div>

    <!-- Botón del menú responsive -->
    <div class="navbar__mobile-btn">
        <button class="mobile-btn__wrap">
            <span class="mobile-btn__line"></span>
            <span class="mobile-btn__line"></span>
            <span class="mobile-btn__line"></span>
        </button>
    </div>

    <!-- Navegación -->
    <nav class="navbar__nav">
        <ul class="nav__list">
            <li class="nav__item">
                <a href="login.html" class="nav__title">Inicio</a>
            </li>
            <!-- Solo disponible para el administrador -->
            <li class="nav__item">
                <a href="#" class="nav__title">Administrar
                    <i class="fa-solid fa-chevron-down nav__icon"></i>
                </a>
                <ul class="nav__submenu">
                    <li class="submenu__item">
                        <a href="register.html" class="submenu__title">Añadir usuario</a>
                    </li>
                    <li class="submenu__item">
                        <a href="user_management.html" class="submenu__title">Eliminar usuario</a>
                    </li>
                </ul>
            </li>
            <li class="nav__item">
                <a href="index.html" class="nav__title">Casos
                    <i class="fa-solid fa-chevron-down nav__icon"></i>
                </a>
                <ul class="nav__submenu">
                    <li class="submenu__item">
                        <a href="crm_abogado.html" class="submenu__title">CRM - Abogados</a>
                    </li>
                    <li class="submenu__item">
                        <a href="crm_admin.html" class="submenu__title">CRM - Administrador</a>
                    </li>
                    <li class="submenu__item">
                        <a href="crm_comercial.html" class="submenu__title">CRM - Comerciales</a>
                    </li>
                    <li class="submenu__item">
                        <a href="mycase.html" class="submenu__title">¿Cómo va mi caso?</a>
                    </li>
                    <li class="submenu__item">
                        <a href="#" class="submenu__title">Modificar el estado de un caso</a>
                    </li>
                    <li class="submenu__item">
                        <a href="cases.html" class="submenu__title">Cartera de casos</a>
                    </li>
                    <li class="submenu__item">
                        <a href="record_cases.html" class="submenu__title">Historial de casos</a>
                    </li>
                    <li class="submenu__item">
                        <a href="#" class="submenu__title">Estudio de viabilidad</a>
                    </li>
                    <li class="submenu__item">
                        <a href="calendar.html" class="submenu__title">Calendario</a>
                    </li>
                </ul>
            </li>
            <li class="nav__item">
                <a href="#" class="nav__title">Documentación
                    <i class="fa-solid fa-chevron-down nav__icon"></i>
                </a>
                <ul class="nav__submenu">
                    <li class="submenu__item">
                        <a href="documents.html" class="submenu__title">Subir documentos</a>
                    </li>
                </ul>
            </li>
            <li class="nav__item">
                <a href="accounting.html" class="nav__title">Contabilidad</a>
            </li>
            <li class="nav__item">
                <a href="#" class="nav__title">Enlaces externos
                    <i class="fa-solid fa-chevron-down nav__icon"></i>
                </a>
                <ul class="nav__submenu">
                    <li class="submenu__item">
                        <a href="#" class="submenu__title">APUD ACTA</a>
                    </li>
                    <li class="submenu__item">
                        <a href="#" class="submenu__title">Cálculo costas procesales</a>
                    </li>
                    <li class="submenu__item">
                        <a href="#" class="submenu__title">Partido judicial</a>
                    </li>
                    <li class="submenu__item">
                        <a href="#" class="submenu__title">Firmafy</a>
                    </li>
                    <li class="submenu__item">
                        <a href="#" class="submenu__title">Legal Pigeon</a>
                    </li>
                </ul>
            </li>
            <li class="nav__item">
                <a href="https://www.corpelegal.com/" class="nav__title">Corpe Legal</a>
            </li>
            <li class="nav__item">
                <a href="#" class="nav__title">Cerrar sesión</a>
            </li>
        </ul>
    </nav>
</header>`;

// Adición del navegador en sus correspondientes contenedores.
    document.querySelector(".menu-mobile").innerHTML = headerTemplateMobile;
    document.querySelector(".layout__header").innerHTML = headerTemplate;
});