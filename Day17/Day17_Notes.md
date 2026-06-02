# Day 17 - TestNG XML & Suite Execution

## What is testng.xml?

testng.xml is used to control TestNG test execution.

Without XML:
- Run each class separately.

With XML:
- Run multiple classes together.
- Run specific groups.
- Create test suites.

---

## Why testng.xml?

Advantages:
- Run multiple test classes at once.
- Execute groups.
- Manage large test suites.
- Better test organization.

---

## Basic Structure

```xml
<suite name="MySuite">

    <test name="MyTests">

        <classes>

            <class name="FirstTestNG"/>

        </classes>

    </test>

</suite>