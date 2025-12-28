# Java Library Maven Template

This is a template for creating a Java library with Maven. It includes a basic project structure, CI/CD with GitHub Actions, and a pre-configured `pom.xml` for easy deployment to Maven Central.

## Features

*   Java 21
*   Maven
*   JUnit 5 for testing
*   CI/CD with GitHub Actions
    *   Build on every push and pull request
    *   Release to Maven Central on version tags
*   Standard project structure

## How to Use

To use this template, click the "Use this template" button on the GitHub repository page. This will create a new repository in your account with the same structure and files.

## Building and Testing

To build the project, run:

```bash
./mvnw clean install
```

To run the tests, run:

```bash
./mvnw test
```

## Continuous Integration

This template uses GitHub Actions for CI/CD. The workflows are defined in the `.github/workflows` directory.

*   `build.yml`: This workflow is triggered on every push and pull request. It builds the project and runs the tests.
*   `release.yml`: This workflow is triggered when a tag starting with `v` is pushed. It deploys the project to Maven Central.

### Releasing a new version

To release a new version, you need to:

1.  Update the version in the `pom.xml` file.
2.  Commit and push the changes.
3.  Create a new tag with the same version number, prefixed with `v`.

```bash
git tag v1.0.0
git push origin v1.0.0
```

This will trigger the `release` workflow, which will deploy the project to Maven Central.

**Note:** You will need to configure your OSSRH username and password, and your GPG signature in your repository secrets.

*   `OSSRH_USERNAME`
*   `OSSRH_PASSWORD`
*   `GPG_PRIVATE_KEY`
*   `GPG_PASSPHRASE`

## Contributing

Contributions are welcome! If you have any ideas, suggestions, or bug reports, please open an issue or submit a pull request.

## License

This project is licensed under the [MIT License](LICENSE).
