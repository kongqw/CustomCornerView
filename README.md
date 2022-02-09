# 自定义圆角控件




![](https://raw.githubusercontent.com/kongqw/CustomCornerView/main/imgs/CustomCornerView.webp)

## 使用

``` xml
<com.kongqw.view.CustomCornerView
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    app:cornerRadius="30dp"
    app:cornerDirection="top"
    android:layout_margin="20dp">

    <WebView
        android:id="@+id/web_view"
        android:layout_width="match_parent"
        android:layout_height="match_parent" />

</com.kongqw.view.CustomCornerView>
```