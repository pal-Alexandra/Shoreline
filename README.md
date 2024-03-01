# Shoreline assignment


I chose to implement the solution in Java, this being an OOP language that allowed me to model the problem according to the requirements.


## Description of the model

Below is a simplified UML diagram of the classes that I made.
 
![shorelineUML](https://github.com/pal-Alexandra/Shoreline/assets/100137533/a9d14e64-60fb-459b-9471-99ed205f5f72)



## Design and algorithms

I design the classes taking into account the relationships induced by the requirements. Also, I tried to separate the logic of the simulation from the classes that are involved the simulation.

## Algorithm

In order to gain as many points as I can, for each round I keep track of the serial numbers of the unhealthy robots. In that way, when I call the commandCenter to repair robots, this  will call only those controllers that have robots that are unhealthy and, more, in order to consume as few points as possible , it is made only one call for a controller to repair as many robots as it can, of those it monitors


## Simulation

This is the output for one of my simulations.

```
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

Start Round: 0
Round points: 0
Controllers effort: 0
Round robots points: 0
Active robots: 0
Current Total points: 0

@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

Start Round: 1
Round points: -278
Controllers effort: -580
Round robots points: 302
Active robots: 335
Current Total points: -278

@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

Start Round: 2
Round points: -152
Controllers effort: -760
Round robots points: 608
Active robots: 664
Current Total points: -430

@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

Start Round: 3
Round points: -222
Controllers effort: -1160
Round robots points: 938
Active robots: 1035
Current Total points: -652

@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

Start Round: 4
Round points: -132
Controllers effort: -1380
Round robots points: 1248
Active robots: 1386
Current Total points: -784

@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

Start Round: 5
Round points: 280
Controllers effort: -1320
Round robots points: 1600
Active robots: 1760
Current Total points: -504

@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

Start Round: 6
Round points: 458
Controllers effort: -1440
Round robots points: 1898
Active robots: 2093
Current Total points: -46

@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

Start Round: 7
Round points: 648
Controllers effort: -1560
Round robots points: 2208
Active robots: 2444
Current Total points: 602

@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

Start Round: 8
Round points: 997
Controllers effort: -1540
Round robots points: 2537
Active robots: 2766
Current Total points: 1599

@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

Start Round: 9
Round points: 1297
Controllers effort: -1540
Round robots points: 2837
Active robots: 3115
Current Total points: 2896

@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

Start Round: 10
Round points: 1578
Controllers effort: -1540
Round robots points: 3118
Active robots: 3443
Current Total points: 4474

@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

Start Round: 11
Round points: 1838
Controllers effort: -1580
Round robots points: 3418
Active robots: 3775
Current Total points: 6312

@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

Start Round: 12
Round points: 2177
Controllers effort: -1580
Round robots points: 3757
Active robots: 4125
Current Total points: 8489

@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

Start Round: 13
Round points: 2494
Controllers effort: -1600
Round robots points: 4094
Active robots: 4486
Current Total points: 10983

@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

Start Round: 14
Round points: 2805
Controllers effort: -1600
Round robots points: 4405
Active robots: 4844
Current Total points: 13788

@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

Start Round: 15
Round points: 3123
Controllers effort: -1600
Round robots points: 4723
Active robots: 5209
Current Total points: 16911

@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

Start Round: 16
Round points: 3469
Controllers effort: -1600
Round robots points: 5069
Active robots: 5567
Current Total points: 20380

@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

Start Round: 17
Round points: 3742
Controllers effort: -1600
Round robots points: 5342
Active robots: 5918
Current Total points: 24122

@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

Start Round: 18
Round points: 4039
Controllers effort: -1600
Round robots points: 5639
Active robots: 6245
Current Total points: 28161

@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

Start Round: 19
Round points: 4305
Controllers effort: -1600
Round robots points: 5905
Active robots: 6598
Current Total points: 32466

@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

Start Round: 20
Round points: 4533
Controllers effort: -1600
Round robots points: 6133
Active robots: 6939
Current Total points: 36999

@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

Start Round: 21
Round points: 4627
Controllers effort: -1600
Round robots points: 6227
Active robots: 7289
Current Total points: 41626

@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

Start Round: 22
Round points: 4624
Controllers effort: -1600
Round robots points: 6224
Active robots: 7655
Current Total points: 46250

@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

Start Round: 23
Round points: 4287
Controllers effort: -1600
Round robots points: 5887
Active robots: 7953
Current Total points: 50537

@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

Start Round: 24
Round points: 4089
Controllers effort: -1600
Round robots points: 5689
Active robots: 8306
Current Total points: 54626

@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

Start Round: 25
Round points: 4078
Controllers effort: -1600
Round robots points: 5678
Active robots: 8646
Current Total points: 58704

@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

Start Round: 26
Round points: 3805
Controllers effort: -1600
Round robots points: 5405
Active robots: 9012
Current Total points: 62509

@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

Start Round: 27
Round points: 3576
Controllers effort: -1600
Round robots points: 5176
Active robots: 9371
Current Total points: 66085

@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

Start Round: 28
Round points: 3145
Controllers effort: -1600
Round robots points: 4745
Active robots: 9674
Current Total points: 69230

@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

Start Round: 29
Round points: 2988
Controllers effort: -1600
Round robots points: 4588
Active robots: 10000
Current Total points: 72218

@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

Start Round: 30
Round points: 1983
Controllers effort: -1600
Round robots points: 3583
Active robots: 10000
Current Total points: 74201

@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

Start Round: 31
Round points: 1989
Controllers effort: -1600
Round robots points: 3589
Active robots: 9696
Current Total points: 76190

@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

Start Round: 32
Round points: 1960
Controllers effort: -1600
Round robots points: 3560
Active robots: 9356
Current Total points: 78150

@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

Start Round: 33
Round points: 2197
Controllers effort: -1600
Round robots points: 3797
Active robots: 9042
Current Total points: 80347

@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

Start Round: 34
Round points: 2362
Controllers effort: -1600
Round robots points: 3962
Active robots: 8715
Current Total points: 82709

@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

Start Round: 35
Round points: 2683
Controllers effort: -1600
Round robots points: 4283
Active robots: 8402
Current Total points: 85392

@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

Start Round: 36
Round points: 2883
Controllers effort: -1600
Round robots points: 4483
Active robots: 8063
Current Total points: 88275

@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

Start Round: 37
Round points: 3115
Controllers effort: -1600
Round robots points: 4715
Active robots: 7737
Current Total points: 91390

@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

Start Round: 38
Round points: 3448
Controllers effort: -1600
Round robots points: 5048
Active robots: 7413
Current Total points: 94838

@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

Start Round: 39
Round points: 3792
Controllers effort: -1600
Round robots points: 5392
Active robots: 7077
Current Total points: 98630

@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

Start Round: 40
Round points: 3754
Controllers effort: -1600
Round robots points: 5354
Active robots: 6749
Current Total points: 102384

@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

Start Round: 41
Round points: 3837
Controllers effort: -1600
Round robots points: 5437
Active robots: 6451
Current Total points: 106221

@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

Start Round: 42
Round points: 3796
Controllers effort: -1600
Round robots points: 5396
Active robots: 6126
Current Total points: 110017

@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

Start Round: 43
Round points: 3568
Controllers effort: -1600
Round robots points: 5168
Active robots: 5794
Current Total points: 113585

@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

Start Round: 44
Round points: 3378
Controllers effort: -1600
Round robots points: 4978
Active robots: 5458
Current Total points: 116963

@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

Start Round: 45
Round points: 3098
Controllers effort: -1600
Round robots points: 4698
Active robots: 5132
Current Total points: 120061

@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

Start Round: 46
Round points: 2776
Controllers effort: -1600
Round robots points: 4376
Active robots: 4833
Current Total points: 122837

@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

Start Round: 47
Round points: 2494
Controllers effort: -1600
Round robots points: 4094
Active robots: 4489
Current Total points: 125331

@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

Start Round: 48
Round points: 2129
Controllers effort: -1580
Round robots points: 3709
Active robots: 4129
Current Total points: 127460

@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

Start Round: 49
Round points: 1793
Controllers effort: -1600
Round robots points: 3393
Active robots: 3769
Current Total points: 129253

@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

Start Round: 50
Round points: 1563
Controllers effort: -1580
Round robots points: 3143
Active robots: 3453
Current Total points: 130816

@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

Start Round: 51
Round points: 1268
Controllers effort: -1540
Round robots points: 2808
Active robots: 3106
Current Total points: 132084

@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

Start Round: 52
Round points: 944
Controllers effort: -1560
Round robots points: 2504
Active robots: 2748
Current Total points: 133028

@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

Start Round: 53
Round points: 729
Controllers effort: -1460
Round robots points: 2189
Active robots: 2414
Current Total points: 133757

@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

Start Round: 54
Round points: 478
Controllers effort: -1380
Round robots points: 1858
Active robots: 2043
Current Total points: 134235

@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

Start Round: 55
Round points: 217
Controllers effort: -1340
Round robots points: 1557
Active robots: 1711
Current Total points: 134452

@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

Start Round: 56
Round points: -22
Controllers effort: -1280
Round robots points: 1258
Active robots: 1381
Current Total points: 134430

@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

Start Round: 57
Round points: -278
Controllers effort: -1200
Round robots points: 922
Active robots: 1021
Current Total points: 134152

@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

Start Round: 58
Round points: -190
Controllers effort: -800
Round robots points: 610
Active robots: 660
Current Total points: 133962

@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

Start Round: 59
Round points: -235
Controllers effort: -560
Round robots points: 325
Active robots: 354
Current Total points: 133727

##################################################################################

Final Total points: 133727

##################################################################################


```
