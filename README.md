# project-Tech-Corp-Simulator

Java_5.pdf- praca domowa na 30.03.2026- Lesson 4a, zadanie 5
ProjectStatus lepiej reprezentować jako enum niż jako String, ponieważ enum zapewnia większe bezpieczeństwo i kontrolę nad wartościami.

Przede wszystkim enum ogranicza możliwe statusy do z góry określonego zestawu. Dzięki temu nie da się przypadkowo przypisać niepoprawnej wartości ani zrobić literówki, co jest bardzo łatwe w przypadku String. Kompilator pilnuje, żeby używać tylko dozwolonych stanów.

Dodatkowo enum poprawia czytelność kodu - jasno widać, że mamy do czynienia ze statusem projektu, a nie dowolnym tekstem. Kod staje się bardziej zrozumiały i mniej podatny na błędy.

Kolejną zaletą jest lepsze wsparcie ze strony IDE i kompilatora, takie jak podpowiedzi, łatwiejsza refaktoryzacja i wykrywanie błędów na etapie kompilacji.

Podsumowując, enum lepiej modeluje rzeczywisty stan projektu, ponieważ zapewnia poprawność danych, zwiększa czytelność kodu i zmniejsza ryzyko błędów.
