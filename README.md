# RecipeFinderWithCompose
Bu projede compose ile ktor kullanarak bir basit uygulama geliştirdim.Amacım compose yetkinliklerimi geliştirmektir.Ayrıca bu projede MVI mimarisi kullandım.Genel olarak MVVM mimarisi kullanıyorum fakat farklı
mimarilerinde öğrenilip ne işe yaradığını ve nerede kullanmam gerektiğini kavrayabilmek adına kullandım.Api'den verileri Retrofit değilde Ktor aracılığıyla getirdim.State kullanarak durumları belirledim ve sonuçlarınıda
Intent'ler içerisinde tutarak kullanıcıya belirttim.



-Compose



-Ktor



-States



-OutlinedTextField (bu özel içerisinde search butonu var edittexti var kullanabilirim.)




-AnimatedVisibility (buda uzun olan açıklamayı arrow butona tıklayınca açılıp kapanması için kullanılan bir özellik)





MVI (Model-View-Intent):
Model:

State yönetimi MVI'da oldukça önemlidir ve genellikle tek bir state objesi kullanılır.
State, uygulama durumunu temsil eder ve bu durum, UI'nin nasıl görüneceğini belirler.
View:

View, sadece UI'yi temsil eder ve kullanıcı girişleri alır.
View, State'e doğrudan erişmez, sadece Intent'leri dinler ve değişiklikleri yayınlar.
Intent:

Kullanıcı eylemleri (örneğin, bir düğmeye tıklama) Intent olarak adlandırılır.
Intent'ler, View tarafından oluşturulur ve ViewModel'e iletilir.
ViewModel, Intent'e tepki olarak State'i günceller.
Unidirectional Data Flow:

Veri akışı tek yönlüdür: View'dan Intent'e, Intent'ten ViewModel'e, ViewModel'den State'e.
Mutable State:

State genellikle değiştirilebilir (mutable) objeler kullanılarak temsil edilir.
MVVM (Model-View-ViewModel):
Model:

MVVM'de, Model, uygulama verilerini ve iş mantığını temsil eder.
View:

View, UI'yi temsil eder ve kullanıcı girişlerini alır.
View, ViewModel ile bağlantılıdır ancak ViewModel'e doğrudan erişmez.
ViewModel:

ViewModel, UI ile iş mantığı arasındaki bağlantıyı sağlar.
View'dan gelen istekleri işler ve Model'e yönlendirir.
State'i (genellikle Observable veri yapıları kullanarak) tutar ve bu durumu View'a günceller.
Two-Way Data Binding:

MVVM'de, View ve ViewModel arasında genellikle iki yönlü veri bağlantısı vardır. Yani, bir değişiklik View tarafından yapıldığında ViewModel'e yansır ve tersi.
Mutable State:State genellikle değiştirilebilir (mutable) objeler kullanılarak temsil edilir.


Ortak Özellikler:
Her ikisi de UI ve iş mantığını ayrı tutarak modüler bir tasarım sağlar.
Her ikisi de test edilebilir ve bakımı kolaydır.
Her iki mimari de belirli durumlarda kullanışlı olabilir, ancak tercih edilen mimari, projenin ihtiyaçlarına, ekibin deneyimine ve tercihlerine bağlı olarak değişebilir.




![Ekran görüntüsü 2023-12-03 205340](https://github.com/Cntrk01/RecipeFinderWithCompose/assets/98031686/adf57113-abc5-4faa-883a-14df87a15731)
