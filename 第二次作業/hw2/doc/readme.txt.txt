<本程式使用UTF-8編碼>
一、作者：
(1)系級:電機工程學系115級乙班
(2)修課班別:計算機概論乙班
(3)學號:E24112085
(4)姓名:張嘉哲

二、程式檔案名稱：
(1)主程式:hw2
(2)輔助程式:ConsoleIn.java

三、操作步驟
(1)請進行功能選擇並輸入，功能包括「add [日期] [類別] [金額]」、「show all」、「show [日期]」、「show [類別]」、「update」、「delete」、「delete all」、「help」、「exit」及「log」。
(2)如選擇輸入「add [日期] [類別] [金額]」，系統將新增一筆帳目並儲存，並返回步驟(1)。
(3)如選擇輸入「show all」，系統將用列表依序顯示所有帳目，同時顯示總金額，並返回步驟(1)。
(4)如選擇輸入「show [日期]」，系統將用列表依序顯示於特定日期的所有帳目。
，並返回步驟(1)。
(5)如選擇輸入「show [類別]」，系統將用列表依序顯示於特定類別的所有帳目，並返回步驟(1)。
(6)如選擇輸入「update」，系統將進入修改模式，選擇輸入[編號] [日期] [類別] [金額]來修改該編號的帳目，系統將更新指定編號之帳目並儲存，並返回步驟(1)。
(7)如選擇輸入「delete」，系統將進入刪除模式，選擇輸入[編號]來刪除該編號的帳目，系統將刪除指定編號之帳目，並返回步驟(1)。
(8)如選擇輸入「delete all」，系統將刪除所有帳目，並返回步驟(1)。
(9)如選擇輸入「help」，系統將列出基本指令集，說明各指令功能，並返回步驟(1)。
(10)如選擇輸入「exit」，程式將結束運作並離開。
(11)如選擇輸入「log」，系統將顯示程式執行時系統紀錄使用者所操作之相關資料，包含錯誤代碼、原因及各變數之數值或字串
，並返回步驟(1)。

四、附加功能
1.新增刪除全部帳目功能
輸入"delete all"可刪除帳本中帳目之全部資料，
減少一一刪除時間
2.新增程式執行記錄功能
輸入"log"可查看程式執行時系統紀錄使用者所操作之相關資料，包含各變數數值及字串的歷史紀錄及變化情形等詳細資訊，可大幅減少程式debug時會遇到的困難
3.顯示總金額
可在show_all中顯示帳目總金額