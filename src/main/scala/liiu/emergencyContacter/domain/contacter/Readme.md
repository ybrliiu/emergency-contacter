# 各クラスの説明

```
ContactJob <- Contacter
           <- ContactParty
```

ContactJob: 連絡Job
  (User: ユーザー, 通知の ON / OFF を確認して実際に通知する) 
  Contacter: 連絡者
    ContactParty: 連絡先, Contacterで連絡する先のURIなどになりそう.
    Communicator: 通信者, ObserverパターンでいうObserver, 実際どのような方法で通信するかはインターフェースの実装先で定義.
ContactContent: 連絡内容

