 l i b r a r y ( c a r e t )  
 l i b r a r y ( t i d y v e r s e )  
 l i b r a r y ( e 1 0 7 1 )  
 l i b r a r y ( k l a R )  
 l i b r a r y ( r p a r t )  
 D S L c l a s s i f i e r   < -   f u n c t i o n ( a l g o   =   " t r e e " , m e t r i c   =   " a c c u r a c y " , s t r a t e g y   =   " t r a i n _ t e s t " , t r a i n _ t e s t _ r a t i o   =   0 . 5 , c r o s s _ v a l i d _ n b   =   3 , p r e d i c t _ c o l u m n   =   - 1 , u s e _ c o l u m n   =   l i s t ( ) , d a t a s e t = N U L L )  
 {  
      
     # #   G e t   t h e   e n v i r o n m e n t   f o r   t h i s  
     # #   i n s t a n c e   o f   t h e   f u n c t i o n .  
     t h i s E n v   < -   e n v i r o n m e n t ( )  
      
      
     # #   C r e a t e   t h e   l i s t   u s e d   t o   r e p r e s e n t   a n  
     # #   o b j e c t   f o r   t h i s   c l a s s  
     m e   < -   l i s t (  
          
         # #   D e f i n e   t h e   e n v i r o n m e n t   w h e r e   t h i s   l i s t   i s   d e f i n e d   s o  
         # #   t h a t   I   c a n   r e f e r   t o   i t   l a t e r .  
         t h i s E n v   =   t h i s E n v ,  
          
         # #   D e f i n e   t h e   a c c e s s o r s   f o r   t h e   d a t a   f i e l d s .  
         g e t E n v   =   f u n c t i o n ( )  
         {  
             r e t u r n ( g e t ( " t h i s E n v " , t h i s E n v ) )  
         } ,  
          
         # # # # # # # # #   A C C E S S O R S   # # # # # # # # #  
          
         g e t A l g o   =   f u n c t i o n ( )  
         {  
             r e t u r n ( g e t ( " a l g o " , t h i s E n v ) )  
         } ,  
          
         s e t A l g o   =   f u n c t i o n ( v a l u e )  
         {  
             r e t u r n ( a s s i g n ( " a l g o " , v a l u e , t h i s E n v ) )  
         } ,  
          
         g e t M e t r i c   =   f u n c t i o n ( )  
         {  
             r e t u r n ( g e t ( " m e t r i c " , t h i s E n v ) )  
         } ,  
          
         s e t M e t r i c   =   f u n c t i o n ( v a l u e )  
         {  
             r e t u r n ( a s s i g n ( " m e t r i c " , v a l u e , t h i s E n v ) )  
         } ,  
          
         g e t S t r a t e g y   =   f u n c t i o n ( )  
         {  
             r e t u r n ( g e t ( " s t r a t e g y " , t h i s E n v ) )  
         } ,  
          
         s e t S t r a t e g y   =   f u n c t i o n ( v a l u e )  
         {  
             r e t u r n ( a s s i g n ( " s t r a t e g y " , v a l u e , t h i s E n v ) )  
         } ,  
          
         g e t T r a i n _ t e s t _ r a t i o   =   f u n c t i o n ( )  
         {  
             r e t u r n ( g e t ( " t r a i n _ t e s t _ r a t i o " , t h i s E n v ) )  
         } ,  
          
         s e t T r a i n _ t e s t _ r a t i o   =   f u n c t i o n ( v a l u e )  
         {  
             r e t u r n ( a s s i g n ( " t r a i n _ t e s t _ r a t i o " , v a l u e , t h i s E n v ) )  
         } ,  
          
         g e t C r o s s _ v a l i d _ n b   =   f u n c t i o n ( )  
         {  
             r e t u r n ( g e t ( " c r o s s _ v a l i d _ n b " , t h i s E n v ) )  
         } ,  
          
         s e t C r o s s _ v a l i d _ n b   =   f u n c t i o n ( v a l u e )  
         {  
             r e t u r n ( a s s i g n ( " c r o s s _ v a l i d _ n b " , v a l u e , t h i s E n v ) )  
         } ,  
          
         g e t P r e d i c t _ c o l u m n   =   f u n c t i o n ( )  
         {  
             r e t u r n ( g e t ( " p r e d i c t _ c o l u m n " , t h i s E n v ) )  
         } ,  
          
         s e t P r e d i c t _ c o l u m n   =   f u n c t i o n ( v a l u e )  
         {  
             r e t u r n ( a s s i g n ( " p r e d i c t _ c o l u m n " , v a l u e , t h i s E n v ) )  
         } ,  
          
         g e t U s e _ c o l u m n   =   f u n c t i o n ( )  
         {  
             r e t u r n ( g e t ( " u s e _ c o l u m n " , t h i s E n v ) )  
         } ,  
          
         s e t U s e _ c o l u m n   =   f u n c t i o n ( v a l u e )  
         {  
             r e t u r n ( a s s i g n ( " u s e _ c o l u m n " , v a l u e , t h i s E n v ) )  
         } ,  
          
         g e t D a t a s e t   =   f u n c t i o n ( )  
         {  
             r e t u r n ( g e t ( " d a t a s e t " , t h i s E n v ) )  
         } ,  
          
         s e t D a t a s e t   =   f u n c t i o n ( d a t a s e t )  
         {  
             r e t u r n ( a s s i g n ( " d a t a s e t " , v a l u e , t h i s E n v ) )  
         } ,  
          
         # # # # # # # # #   M E T H O D S   # # # # # # # # #  
          
         r e a d   =   f u n c t i o n ( p a t h ,   s e p = " , " )  
         {  
             a s s i g n ( " d a t a s e t " , r e a d . c s v ( f i l e = p a t h , s e p = s e p , h e a d e r   =   T ,   s t r i n g s A s F a c t o r s   =   F ) , t h i s E n v )  
         } ,  
          
         a d d _ c o l u m n s = f u n c t i o n ( c o l s ) {  
             f o r   ( i   i n   c o l s ) {  
                 s t o p i f n o t ( 0   < =   i )  
                 s t o p i f n o t ( i   < =   l e n g t h ( d a t a s e t ) )  
                 a s s i g n ( " u s e _ c o l u m n " , a p p e n d ( u s e _ c o l u m n , l i s t ( i ) ) , t h i s E n v )  
             }  
         } ,  
          
         r e m o v e _ c o l u m n s = f u n c t i o n ( c o l s ) {  
             r e s = u s e _ c o l u m n  
             f o r   ( i   i n   c o l s ) {  
                 s t o p i f n o t ( 0   < =   i )  
                 s t o p i f n o t ( i   < =   l e n g t h ( d a t a s e t ) )  
                 j = 1  
                 w h i l e   ( j   < = l e n g t h ( r e s ) ) {  
                     i f   ( r e s [ [ j ] ]   = =   i ) {  
                         r e s [ j ] < - N U L L  
                     }  
                     j < - j + 1  
                 }  
             }  
             a s s i g n ( " u s e _ c o l u m n " , r e s , t h i s E n v )  
         } ,  
          
         m a x = f u n c t i o n ( a , b ) {  
             i f   ( a > b ) { r e t u r n ( a ) }  
             e l s e { r e t u r n ( b ) }  
         } ,  
  
         d o P r e d i c t i o n = f u n c t i o n ( ) {  
              
             i f   ( l e n g t h ( u s e _ c o l u m n ) = = 0 ) {  
                 i < - 1  
                 w h i l e ( i < l e n g t h ( d a t a s e t ) ) {  
                     u s e _ c o l u m n   < -   a p p e n d ( u s e _ c o l u m n , l i s t ( i ) )  
                     i < - i + 1  
                 }  
                 p r e d i c t _ c o l u m n < - l e n g t h ( d a t a s e t ) - 1  
             }  
  
             u s e d _ d a t a s e t   < -   d a t a s e t  
             u s e d _ c o l u m n s   < -   u s e _ c o l u m n  
             p r e d i c t e d _ c o l u m n   < -   p r e d i c t _ c o l u m n   +   1  
          
             j < - 1  
              
             w h i l e   ( j   < =   l e n g t h ( u s e d _ c o l u m n s ) ) {  
                 u s e d _ c o l u m n s [ [ j ] ] < - u s e d _ c o l u m n s [ [ j ] ] + 1  
                 j < - j + 1  
             }  
              
              
             #   R e m o v e s   t h e   d u p l i c a t e s   f r o m   t h e   c o l u m n s   l i s t  
             d o u b l o n s < - w h i c h ( d u p l i c a t e d ( u s e d _ c o l u m n s ) )  
             i f   ( l e n g t h ( d o u b l o n s ) > 0 ) {  
                 u s e d _ c o l u m n s < - u s e d _ c o l u m n s [ - d o u b l o n s ]  
             }  
              
             #   B u i l d   t r a i n _ c o l u m n s   =   l i s t   o f   t h e   c o l u m n s   u s e d   t o   t r a i n   t h e   m o d e l   ( w i t h o u t   p r e d i c t _ c o l u m n )  
             t r a i n _ c o l u m n s   < -   u s e d _ c o l u m n s  
              
             i f   ( ! ( p r e d i c t e d _ c o l u m n   % i n %   u s e d _ c o l u m n s ) ) {  
                 u s e d _ c o l u m n s < - a p p e n d ( u s e d _ c o l u m n s , l i s t ( p r e d i c t e d _ c o l u m n ) )  
             }  
              
             e l s e   {  
                 t r a i n _ c o l u m n s [ [ m a t c h ( p r e d i c t e d _ c o l u m n , u s e d _ c o l u m n s ) ] ] < - N U L L  
             }  
              
             #   T r a n s f o r m s   t h e   l i s t   i n t o   v e c t o r s    
             u s e d _ c o l u m n s   < -   u n l i s t ( u s e d _ c o l u m n s )  
             t r a i n _ c o l u m n s   < -   u n l i s t ( t r a i n _ c o l u m n s )  
              
             u s e d _ d a t a s e t   < -   s u b s e t ( u s e d _ d a t a s e t ,   s e l e c t =   u s e d _ c o l u m n s )  
             c o l _ n a m e s   < -   n a m e s ( d a t a s e t )  
             u s e d _ c o l _ n a m e s   < -   n a m e s ( u s e d _ d a t a s e t )  
             f o r m e r _ p r e d i c t _ n a m e   < -   c o l _ n a m e s [ p r e d i c t e d _ c o l u m n ]  
             i n d e x O f P r e d i c t   < -   m a t c h ( f o r m e r _ p r e d i c t _ n a m e , u s e d _ c o l _ n a m e s )  
             u s e d _ c o l _ n a m e s [ [ i n d e x O f P r e d i c t ] ] < - " P r e d i c t "  
             c o l n a m e s ( u s e d _ d a t a s e t )   < -   u s e d _ c o l _ n a m e s  
              
             t r a i n I n d e x   < -   c a r e t : : c r e a t e D a t a P a r t i t i o n ( u s e d _ d a t a s e t $ P r e d i c t ,   p = t r a i n _ t e s t _ r a t i o ,   l i s t   =   F A L S E )  
              
              
             t r a i n i n g D a t a   < -   u s e d _ d a t a s e t [ t r a i n I n d e x , ]   #   t r a i n i n g   s e t   c r e a t i o n  
              
              
             t e s t i n g D a t a   < -   u s e d _ d a t a s e t [ - t r a i n I n d e x , ]   #   t e s t i n g   s e t   c r e a t i o n  
              
              
             j < - 1  
              
             w h i l e   ( j   < =   l e n g t h ( t r a i n _ c o l u m n s ) ) {  
                 f o r m e r _ n a m e   < -   c o l _ n a m e s [ t r a i n _ c o l u m n s [ [ j ] ] ]  
                 i n d e x   < -   m a t c h ( f o r m e r _ n a m e , u s e d _ c o l _ n a m e s )  
                 t r a i n _ c o l u m n s [ [ j ] ] < - i n d e x  
                 j < - j + 1  
             }  
              
             t r a i n _ c o l u m n s   < -   u n l i s t ( t r a i n _ c o l u m n s )  
              
             x _ t e s t   < -   t e s t i n g D a t a [ , t r a i n _ c o l u m n s ]  
             y _ t e s t   < -   t e s t i n g D a t a [ , i n d e x O f P r e d i c t ]  
  
             i f   ( a l g o   = =   " s v m " ) {  
                 m o d e l . f i t   < -   s v m ( a s . f a c t o r ( P r e d i c t ) ~ . ,   d a t a = t r a i n i n g D a t a ,   k e r n e l = " l i n e a r " , s c a l e = F )  
             }  
             e l s e   i f   ( a l g o = = " t r e e " ) {  
                 m o d e l . f i t   < -   r p a r t : : r p a r t ( a s . f a c t o r ( P r e d i c t ) ~ . ,   d a t a = t r a i n i n g D a t a ,   m e t h o d   =   ' c l a s s ' )  
             }  
              
             e l s e   {  
                 s t o p ( " a l g o   m u s t   b e   e i t h e r   \ " s v m \ "   o r   \ " t r e e \ " " )  
             }  
              
              
             i f   ( s t r a t e g y   = =   " c r o s s _ v a l i d " ) {  
                 c t r l   < -   t r a i n C o n t r o l ( m e t h o d   =   " r e p e a t e d c v " ,   r e p e a t s   =   c r o s s _ v a l i d _ n b ,   s a v e P r e d = T )  
                 i f   ( a l g o   = =   " s v m " ) {  
                     m o d e l . f i t   < -   t r a i n ( a s . f a c t o r ( P r e d i c t ) ~ . ,   d a t a = t r a i n i n g D a t a ,   m e t h o d   =   " s v m L i n e a r " ,   t r C o n t r o l   =   c t r l )  
                 }  
                 e l s e   i f   ( a l g o = = " t r e e " ) {  
                     m o d e l . f i t   < -   t r a i n ( a s . f a c t o r ( P r e d i c t ) ~ . ,   d a t a = t r a i n i n g D a t a ,   m e t h o d   =   " r p a r t " ,   t r C o n t r o l   =   c t r l )  
                 }  
                 m o d e l . p r e d   < -   m o d e l . f i t $ p r e d $ p r e d  
                 y _ t e s t   < -   m o d e l . f i t $ p r e d $ o b s  
             }  
             e l s e   i f   ( s t r a t e g y = = " t r a i n _ t e s t " ) {  
                 m o d e l . p r e d   < -   p r e d i c t ( m o d e l . f i t ,   x _ t e s t ,   t y p e   =   " c l a s s " )  
             }  
             e l s e   {  
                 s t o p ( " s t r a t e g y   m u s t   b e   e i t h e r   \ " t r a i n _ t e s t \ "   o r   \ " c r o s s _ v a l i d \ " " )  
             }  
              
             c m   =   a s . m a t r i x ( t a b l e ( m o d e l . p r e d ,   y _ t e s t ) )  
             n   =   s u m ( c m )   #   n u m b e r   o f   i n s t a n c e s  
             n c   =   n r o w ( c m )   #   n u m b e r   o f   c l a s s e s  
             d i a g   =   d i a g ( c m )   #   n u m b e r   o f   c o r r e c t l y   c l a s s i f i e d   i n s t a n c e s   p e r   c l a s s    
             r o w s u m s   =   a p p l y ( c m ,   1 ,   s u m )   #   n u m b e r   o f   i n s t a n c e s   p e r   c l a s s  
             c o l s u m s   =   a p p l y ( c m ,   2 ,   s u m )   #   n u m b e r   o f   p r e d i c t i o n s   p e r   c l a s s  
              
              
             i f   ( m e t r i c   = =   " r e c a l l " ) {  
                 r e c a l l < - m e a n ( d i a g   /   r o w s u m s )  
                 i f   ( i s . n a ( r e c a l l ) ) {  
                     r e c a l l < - 0  
                 }  
                 s c o r e < - r e c a l l  
             }  
              
             e l s e   i f   ( m e t r i c   = =   " f 1 " ) {  
                 p r e c i s i o n   =   d i a g   /   c o l s u m s    
                   r e c a l l   =   d i a g   /   r o w s u m s    
                   f 1   < -   m e a n ( 2   *   p r e c i s i o n   *   r e c a l l   /   ( p r e c i s i o n   +   r e c a l l ) )  
                 i f   ( i s . n a ( f 1 ) ) {  
                     f 1 < - 0  
                 }  
                 s c o r e < - f 1  
             }  
              
             e l s e   i f   ( m e t r i c   = =   " a c c u r a c y " )   {  
                 a c c u r a c y < - s u m ( d i a g )   /   s u m ( c m )  
                 i f   ( i s . n a ( a c c u r a c y ) ) {  
                     a c c u r a c y < - 0  
                 }  
                 s c o r e < - a c c u r a c y  
             }  
             e l s e   {  
                 s t o p ( " m e t r i c   s h o u d   b e   e i t h e r   \ " a c c u r a c y \ " ,   \ " r e c a l l \ "   o r   \ " f 1 \ " " )  
             }  
              
             c a t ( " F o r   t h e " , a l g o , " a l g o r i t h m ,   a n d   t h e " , s t r a t e g y , " s t r a t e g y ,   w e   f o u n d   a " , m e t r i c )  
             c a t ( " - s c o r e   o f " , s c o r e )  
         }  
     )  
      
     # #   D e f i n e   t h e   v a l u e   o f   t h e   l i s t   w i t h i n   t h e   c u r r e n t   e n v i r o n m e n t .  
     a s s i g n ( ' t h i s ' , m e , e n v i r = t h i s E n v )  
      
     # #   S e t   t h e   n a m e   f o r   t h e   c l a s s  
     c l a s s ( m e )   < -   a p p e n d ( c l a s s ( m e ) , " D S L c l a s s i f i e r " )  
     r e t u r n ( m e )  
 }  
  
 c l a s s i f i e r < - D S L c l a s s i f i e r ( )  
 c l a s s i f i e r $ r e a d ( " C : / U s e r s / U t i l i s a t e u r / D o c u m e n t s / E S I R / E S I R 3 - S I F / D S L / P r o j e t G i t / D S L - P r o j e c t / m l . c l a s s i f i c a t i o n . d s l . t e s t s / T e s t F i l e s / r u n P y R / i r i s . c s v " ,   " , " )  
 c l a s s i f i e r $ a d d _ c o l u m n s ( l i s t ( 0 ,   1 ,   2 ) )  
 c l a s s i f i e r $ r e m o v e _ c o l u m n s ( l i s t ( 2 ) )  
 c l a s s i f i e r $ s e t P r e d i c t _ c o l u m n ( 3 )  
 c l a s s i f i e r $ s e t A l g o ( " t r e e " )  
 c l a s s i f i e r $ s e t M e t r i c ( " f 1 " )  
 c l a s s i f i e r $ s e t S t r a t e g y ( " c r o s s _ v a l i d " )  
 c l a s s i f i e r $ d o P r e d i c t i o n ( )  
