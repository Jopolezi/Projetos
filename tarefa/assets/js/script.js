document.addEventListener('DOMContentLoaded', () => {
    document.addEventListener('scroll', () => {
        const navbar = document.querySelector('#header');
        const scrollTop = window.scrollY;

        navbar.classList.toggle('rolar', scrollTop > 0);
    });
});

// Scroll Reveal
ScrollReveal({ reset: false });

ScrollReveal().reveal('.content-wrapper', { 
  duration: 2000,
  origin: 'left',
  distance: '10%'
});

ScrollReveal().reveal('.img-content', { 
  duration: 2000,
  origin: 'bottom',
  distance: '10%'
});

ScrollReveal().reveal('.cards-wrapper', { 
  duration: 2000,
  origin: 'bottom',
  distance: '10%'
});