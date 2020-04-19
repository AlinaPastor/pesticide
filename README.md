# Pesticide
A Library To Write Domain-Driven Tests

## What are DDT?
Unit-Tests are very useful but they work on a small scale, we can test only a few objects or functions in this way.

We also need a way to test our full application end-to-end in order to be sure to be on the right track. We can do that simulating user clicking on the web page but we need a more abstract way to represent it, otherwise, tests would become quickly very hard to understand

Nat Pryce invented the Domain-Driven style of tests when he got tired of tests written in a way "click here and then click there".

They have been named from the concern that tests should concentrate on the business domain and he named this style DDT also as a pun since they are quite efficient in killing bugs (like the pesticide).
We also aim to use the same terms both in our tests and in the conversation with the business people. In this way, we can facilitate the communication between people working on the software and the business domain experts. This practice is sometimes called the ubiquitous language. For more information see [https://martinfowler.com/bliki/UbiquitousLanguage.html]

The goal is to describe our stories as interactions between actors (mostly human beings)  and as an abstraction of our system. Using different system implementations we can reach these benefits:

- Test the functionality end to end
- Document the story using the business language
- Not depending on technical details (click here/click there)
- Ensure that the logic is separated from the infrastructure layer (Http, Json, etc.)
- Make sure there is no business logic in the infrastructure layer
- Make sure there is no infrastructure in the business layer

## How does Pesticide work?
See examples in the pesticide-example projects

TBC
