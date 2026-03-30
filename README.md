# project-Tech-Corp-Simulator

Java_5.pdf- praca domowa na 30.03.2026- Lesson 4a, zadanie 5
ProjectStatus lepiej reprezentować jako enum niż jako String, ponieważ enum zapewnia większe bezpieczeństwo i kontrolę nad wartościami.

Przede wszystkim enum ogranicza możliwe statusy do z góry określonego zestawu. Dzięki temu nie da się przypadkowo przypisać niepoprawnej wartości ani zrobić literówki, co jest bardzo łatwe w przypadku String. Kompilator pilnuje, żeby używać tylko dozwolonych stanów.

Dodatkowo enum poprawia czytelność kodu - jasno widać, że mamy do czynienia ze statusem projektu, a nie dowolnym tekstem. Kod staje się bardziej zrozumiały i mniej podatny na błędy.

Kolejną zaletą jest lepsze wsparcie ze strony IDE i kompilatora, takie jak podpowiedzi, łatwiejsza refaktoryzacja i wykrywanie błędów na etapie kompilacji.

Podsumowując, enum lepiej modeluje rzeczywisty stan projektu, ponieważ zapewnia poprawność danych, zwiększa czytelność kodu i zmniejsza ryzyko błędów.

Zadanie 4 w pliku Java_5 dla lesson 4b 
Mówienie, że klasa „jest pracownikiem” oznacza, że należy do konkretnej kategorii obiektów i dziedziczy po klasie Employee. Jest to relacja typu „is-a”, która określa tożsamość obiektu.

Natomiast mówienie, że klasa „jest Workable” oznacza, że posiada pewną zdolność - w tym przypadku potrafi wykonywać pracę. Jest to relacja oparta na możliwościach, a nie na tym, czym obiekt jest.

Zadanie 5 w pliku Java_5 dla lesson 4b 
Lepiej jest, aby klasa Project zależała od Workable niż bezpośrednio od Employee, ponieważ Workable reprezentuje ogólną zdolność wykonywania pracy, a nie konkretny typ obiektu. Dzięki temu Project może współpracować z różnymi rodzajami obiektów, nie tylko z pracownikami, ale także na przykład z narzędziami lub botami.

Takie podejście zwiększa elastyczność systemu i ułatwia jego rozwijanie. Można dodawać nowe typy obiektów bez konieczności zmiany istniejącego kodu. Dodatkowo zmniejsza to powiązania między klasami, co sprawia, że system jest bardziej czytelny i łatwiejszy w utrzymaniu.