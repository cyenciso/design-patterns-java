# Observer Pattern
Defines a one-to-many dependency between objects so that when one object changes state, all of its dependents are notified and updated automatically. -- Head First Design Patterns, page 51.

## My Take-Away
The Subject has state and can notify its list of Observers that changes have been made. The Observers, after being notified, can get the state they specifically need from their subject using getters.