(ns yaclomp.core-test
  (:require [instaparse.core :as insta]
            [midje.sweet :refer :all]
            [yaclomp.core :refer [parse-org] :rename {parse-org po}]))


(fact "A complex document parses unambiguously"
  (->> "#+TITLE: All Your Org Mode Dox are Belong to Us...

A bit at the top.  

* Hey good lookin
 
* Another headline
* and another...

Here's some body copy.

*** with deeper nesting...

#+META: a b c

doe a deer a female deer

* A topic
** Another topic
* A toplevel topic

More whitespace above.

Some more text.
"
       (insta/parses po)
       count) => 1)
