| Code Quality | Issues in Progress | Issues Ready | HitCout |
|:-:|:-:|:-:|:-:|
|[![Codacy Badge](https://api.codacy.com/project/badge/Grade/485163af383d4a59a4a4e9249a121cb5)](https://www.codacy.com/app/felipexw/MinhasTarefas?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=felipexw/MinhasTarefas&amp;utm_campaign=Badge_Grade)|[![Stories in Progress](https://badge.waffle.io/luankevinferreira/expenses.svg?label=In%20Progress&title=In%20Progress)](http://waffle.io/luankevinferreira/expenses)|[![Stories in Ready](https://badge.waffle.io/felipexw/MinhasTarefas.svg?label=ready&title=Ready)](http://waffle.io/felipexw/MinhasTarefas)|[![HitCount](https://hitt.herokuapp.com/felipexw/minhas-tarefas.svg)](https://github.com/felipexw/MinhasTarefas)

# MinhasTarefas

=======
Summary

Just another App to help you manage your daily tasks.


Goals
======

- Understand the basics concepts behind Android architecture
- Understand the keys principles behind Android
- Understand the keys priciples that support the Android the libraries used in this project


Design Patterns
=======

- [Model-View-Presenter (MVP)](https://pt.wikipedia.org/wiki/Model-view-presenter)
- [Repository Pattern](http://blog.caelum.com.br/repository-seu-modelo-mais-orientado-a-objeto/)


Dependencies
======= 

#Testing


##Unity Testing
Unit testing is a particular kind of testing which is responsible for testing a very isolated feature. In other words, this kind of project aims to run testing in isolation of other components. Normally, this type of test its inside the package ```app/src/test/java```.
The most commons unit testing frameworks available are the following:

- [Truth](https://github.com/google/truth)
- [RobotEletric](http://robolectric.org/)
- [JUnit](http://junit.org/junit4/) - version 5 its coming up! :) -
- [MoreAsserts](https://developer.android.com/reference/android/test/MoreAsserts.html)
- [AssertJ Android](http://square.github.io/assertj-android/)
- [ViewAsserts](https://developer.android.com/reference/android/test/ViewAsserts.html)

##Instrumentation Testing
Instrutamentation tests do require an emulator or actual device to run. They can be described as tests that are performed when its needed to control the Android's components lifecycle (e.g. drive the activities instead of having these driven by the system). tipically they are place inside ```app/src/androidTest/java``` package.

- [Espresso](https://developer.android.com/training/testing/ui-testing/espresso-testing.html)
- [UIAutomator](https://developer.android.com/training/testing/ui-testing/uiautomator-testing.html)
- [Google Android Testing](https://developer.android.com/studio/test/index.html)
- [Robotium](https://github.com/RobotiumTech/robotium)
- [Selendroid](http://selendroid.io/)
-

##Mocking 
Mocking objects are objects responsible for "mimic" real domain objets. 

- [Mockito](http://mockito.org/)
- [EasyMock](http://easymock.org/)
- [PowerMock](https://github.com/jayway/powermock)


#Tools

- [Lombok](https://projectlombok.org/)
- [ActiveAndroid](http://www.activeandroid.com/)

#DI frameworks
- [AndroidAnnotations](http://androidannotations.org/)
- [Dagger](http://square.github.io/dagger/)


