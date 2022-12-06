# Jakart EE

Dit project is een voorbeeld van Jakarta EE 9.1 Web Profile.

## Installation

Het project is aangemaakt met het maven archetype [maven-archetype-jakartaee9](https://github.com/hantsy/maven-archetype-jakartaee9).

```bash
mvn -B archetype:generate \
-DarchetypeGroupId=io.github.hantsy \
-DarchetypeArtifactId=maven-archetype-jakartaee9  \
-DarchetypeVersion=1.0  \
-DgroupId=com.example \
-Dpackage=com.example.demo \
-DartifactId=myapp \
-Dversion=1.0-SNAPSHOT 
```
De applicatie is getest met OpenLiberty versie 22.

## Usage

De applicatie is geconfigureerd voor het gebruik van [Liberty maven plugin](https://github.com/OpenLiberty/ci.maven).

Maak een nieuwe Liberty server aan met
```bash
mvn liberty:create
```

De applicatie kan worden gedraaid met
```
mvn liberty:run
```

Ook is live coding mogelijk:
```
mvn liberty:dev
```

## Code

De code bestaat uit een REST service (GreetingResource), 
een stateless EJB (GreetingService) en een repository 
(GreetingRepository).

Er wordt gebruik gemaakt van componenten van webprofile-9.1.
Dit zijn
- restfulWS-3.0
- cdi-3.0
- jsonb-2.0
- enterpriseBeansLite-4.0

Deze zijn als feature opgenomen in de server.xml.
De volledige feature lijst is te vinden op de [Liberty features site](https://www.ibm.com/docs/en/was-liberty/base?topic=management-liberty-features).

N.B. Jakarta EE bestaat uit de full versie Jakarta EE Platform 9.1, waarin alle features zitten. 
Er is ook een lite versie, genaamd Jakarta EE 9.1 Web Profile.
Deze wordt in het algemeen gebruikt voor projecten met REST services, servlets en 
andere front-end gerelateerde technology.

In plaats van de lite versie kaner ook voor worden gekozen om MicroProfile
te gebruiken. Hierin zitten ook heel veel dezelfde technologieen, 
maar is meer gefocust op micro services.