# Materials RA3 - Automatització del testing

Aquest projecte està pensat per treballar JUnit 5 i una introducció pràctica a CI/CD.

## Estructura
- `src/main/java`: codi de producció
- `src/test/java`: esquelets de proves
- `.github/workflows/maven-tests.yml`: pipeline bàsica amb GitHub Actions
- `.github/workflows/maven-tests-defectuos.yml`: versió amb error deliberat per a l'exercici d'anàlisi

## Ordres útils
```bash
mvn test
mvn clean test
```

## Objectiu
Completar les classes de test i automatitzar-ne l'execució.
