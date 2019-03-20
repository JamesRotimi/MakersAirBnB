# Makers Air BnB

## Setup environment

In order to setup the Database structure run the following command from the command line:

```bash
./setup-database
# or
./setup-database-test
```

## Spring Boot Framework Notes

`JpaRepository` is provided by the framework and is an interface that is used to abstract the data layer so that
there is no direct access for instance to the database.

The `SpaceRepository` is also an interface and it defines a contract, because inherits from `JpaRepository`, its contract 
inherits all the methods definitions defined in the `JpaRepository`.

Interfaces in Java cannot be instantiated, they are abstracts concepts, so we need to `implement` an interface in order to
have a `concrete` class that acts as defined in the contract.

If a repository is annotated with `@Repostory` then spring boot will auto-generate at runtime an implementation on-the-fly
and will register a new instance of that implementation into the Dependency Injection Container for later use.