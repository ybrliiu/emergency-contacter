# 各クラスの説明

```
ContactJob <- Contacter
           <- ContactParty
```

ContactJob: 通知Job
Contacter: 通知者, ObserverパターンでいうObserver, 実際どのような方法で通知するかはインターフェースの実装先で定義.
ContactParty: 通知先, Contacterで通知する先のURIなどになりそう.

