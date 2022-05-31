import gsap from "webjars/gsap/src/gsap-core.js";
import CSSPlugin from "webjars/gsap/src/CSSPlugin.js";
const gsapWithCSS = gsap.registerPlugin(CSSPlugin) || gsap, // to protect from tree shaking
	TweenMaxWithCSS = gsapWithCSS.core.Tween;

export { gsapWithCSS as gsap, gsapWithCSS as default, CSSPlugin, TweenMaxWithCSS as TweenMax };

export { TweenLite, TimelineMax, TimelineLite, Power0, Power1, Power2, Power3, Power4, Linear, Quad, Cubic, Quart, Quint, Strong, Elastic, Back, SteppedEase, Bounce, Sine, Expo, Circ, wrap, wrapYoyo, distribute, random, snap, normalize, getUnit, clamp, splitColor, toArray, mapRange, pipe, unitize, interpolate, shuffle, selector } from "webjars/gsap/src/gsap-core.js";
export * from "webjars/gsap/src/CustomEase.js";
export * from "webjars/gsap/src/CSSRulePlugin.js";
export * from "webjars/gsap/src/Draggable.js";
export * from "webjars/gsap/src/EaselPlugin.js";
export * from "webjars/gsap/src/EasePack.js";
export * from "webjars/gsap/src/Flip.js";
export * from "webjars/gsap/src/MotionPathPlugin.js";
export * from "webjars/gsap/src/Observer.js";
export * from "webjars/gsap/src/PixiPlugin.js";
export * from "webjars/gsap/src/ScrollToPlugin.js";
export * from "webjars/gsap/src/ScrollTrigger.js";
export * from "webjars/gsap/src/TextPlugin.js";

//BONUS EXPORTS
//export * from "./DrawSVGPlugin.js";
//export * from "./Physics2DPlugin.js";
//export * from "./PhysicsPropsPlugin.js";
//export * from "./ScrambleTextPlugin.js";
//export * from "./CustomBounce.js";
//export * from "./CustomWiggle.js";
//export * from "./GSDevTools.js";
//export * from "./InertiaPlugin.js";
//export * from "./MorphSVGPlugin.js";
//export * from "./MotionPathHelper.js";
//export * from "./ScrollSmoother.js";
//export * from "./SplitText.js";